package com.bw.controller;

import com.bw.pojo.Chanpin;
import com.bw.pojo.User;

import com.alipay.api.AlipayApiException;
import com.alipay.api.internal.util.AlipaySignature;
import com.bw.config.AlipayConfig;
import com.bw.pojo.Dingdan;
import com.bw.pojo.User;
import com.bw.pojo.vo.All;
import com.bw.service.DingdanService;
import com.bw.service.UserService;
import com.bw.util.MD5Util;
import com.bw.util.UUIDUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

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

    @RequestMapping("/login")
    public User login(@RequestBody User user){
        User login = userService.getUserByUsername(user);
        System.out.println(login);
        //û������, ���ش�����Ϣ
        if (login==null){
            User user1 = new User();
            user1.setUpwd("0");
            return user1;
        }
        //�����û�����
        if (MD5Util.input2db(user.getUpwd(),login.getUsalt()).equals(login.getUpwd())){
            redisTemplate.opsForValue().set("login",login);
            return login;
        }else {  //��֤ʧ��
            User user1 = new User();
            user1.setUpwd("0");
            return user1;
        }

    }

    @RequestMapping("/addUser")
    public String addUser(@RequestBody User user){
        String salt = UUIDUtil.uuid();
        user.setUsalt(salt);
        user.setUpwd(MD5Util.input2db(user.getUpwd(),salt));
        userService.addUser(user);
        return "ok";
    }

    @RequestMapping("/findByUid")
    public User findByUid(@RequestParam("uid")long uid) {

        return userService.findByUid(uid);

    }

    @RequestMapping("/logindingdan")
    private String logindingdan(@RequestParam("uid")Long uid,
                                @RequestBody All all){

        System.out.println(all);
        User login = userService.logindingdan(uid);
        Chanpin chanpin = userService.findByCid(all.getCid());
        System.out.println(chanpin+"产品查询");
        chanpin.setShouyi(all.getMoney()+chanpin.getShouyi());


            Dingdan dingdan = new Dingdan();
            dingdan.setCid(all.getCid());
            dingdan.setUid(uid);
            dingdan.setUdate(new Date());
            dingdan.setDstatus((long)0);
            dingdanService.Add(dingdan);
            login.setYue(new Double(login.getYue()-all.getMoney()));
            userService.upYue(login);
            chanpin.setNum(chanpin.getNum()+1);
            userService.upChanPin(chanpin);
        if (chanpin.getShouyi() >= chanpin.getBenjin()) {
            chanpin.setStatus(1L);
            userService.upChanPinStatus(chanpin);
            return "ok";
        }

            return "ok";
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
        login.setYue(new Double(total_amount));
        System.out.println(new Double(total_amount));
        userService.update(login);
        return "";
    }

}
