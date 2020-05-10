package com.bw.controller;

import com.bw.pojo.User;
import com.bw.service.ZhifuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;

@Controller
@CrossOrigin
public class ZhifuController {
    @Autowired
    private ZhifuService ss;

    @GetMapping("shuai")
    public String shuai(){

        return "index";
    }

    @GetMapping("wang")
    public String wang(double WIDtotal_amount){


        return "alipay.trade.page.pay";
    }

    @GetMapping("return_url")
    public String return_url(BigDecimal total_amount){
            long uid=1;
        User user = new User();
        user.setUid(uid);
        user.setYue(total_amount);
        ss.chongzhi(user);

        return "chongzhi";
    }




    @GetMapping("notify_url")
    public String notify_url(){


        return "notify_url";
    }





}
