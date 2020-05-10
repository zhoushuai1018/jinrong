package com.bw.controller;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.bw.config.AlipayConfig;
import com.bw.pojo.Dingdan;
import com.bw.pojo.User;
import com.bw.pojo.vo.All;
import com.bw.service.DingdanService;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.*;

@RequestMapping("/user")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private DingdanService dingdanService;

    @RequestMapping("/findAll")
    private List findAll(){
        return userService.findAll();
    }

    @RequestMapping("/add")
    private String add(@RequestBody User user){
         userService.add(user);
         return "ok";
    }

    @RequestMapping("/login")
    private User login(@RequestBody User user){

        User login = userService.login(user);
        if (login!=null){
            redisTemplate.opsForValue().set("login",login);
            return login;
        }
        return null;
    }

    @RequestMapping("/logindingdan")
    private User logindingdan(@RequestBody All all){
        User user = new User();
        user.setUname(all.getUname());
        user.setUpwd(all.getUpwd());
        User login = userService.logindingdan(user);
        if (login!=null){
            redisTemplate.opsForValue().set("login",login);
            Dingdan dingdan = new Dingdan();
            dingdan.setCid(all.getCid());
            dingdan.setUid(login.getUid());
            dingdan.setUdate(new Date());
            dingdan.setDstatus((long)0);
            dingdanService.Add(dingdan);
            login.setYue(new BigDecimal(all.getZong()));
            userService.upYue(login);
            return login;
        }
        return null;
    }

    @RequestMapping("/findOne")
    private User findOne(@RequestParam("uid") Long uid){

        return userService.findOne(uid);
    }



    @RequestMapping("/chongzhi")
    public String chongzhi(@RequestParam("total_amount")String total_amount, HttpServletRequest request) throws AlipayApiException, UnsupportedEncodingException {
        Map<String,String> params = new HashMap<String,String>();
        Map<String,String[]> requestParams = request.getParameterMap();
        for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
            String name = (String) iter.next();
            String[] values = (String[]) requestParams.get(name);
            String valueStr = "";
            for (int i = 0; i < values.length; i++) {
                valueStr = (i == values.length - 1) ? valueStr + values[i]
                        : valueStr + values[i] + ",";
            }
            //乱码解决，这段代码在出现乱码时使用
            valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
            params.put(name, valueStr);
        }

        boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

        //——请在这里编写您的程序（以下代码仅作参考）——
        if(signVerified) {
            //商户订单号
            String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //支付宝交易号
            String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");

            //付款金额
            total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");

            System.out.println("trade_no:"+trade_no+"<br/>out_trade_no:"+out_trade_no+"<br/>total_amount:"+total_amount);
        }else {
            System.out.println("验签失败");
        }
        User login = (User) redisTemplate.opsForValue().get("login");
        login.setYue(new BigDecimal(total_amount));
        userService.update(login);
        return "";
    }

}
