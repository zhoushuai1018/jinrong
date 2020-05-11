package com.bw.controller;

import com.bw.pojo.User;
import com.bw.service.UserService;
import com.bw.service.ZhifuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("zhifu")
@CrossOrigin
public class ZhifuController {
    @Autowired
    private ZhifuService ss;

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserService userService;

    @GetMapping("chongzhi")
    public String chongzhi(String uid,String WIDtotal_amount){
        String ss="shuai";
        System.out.println(uid);
        redisTemplate.opsForValue().set(ss,uid);

        return "alipay.trade.page.pay";
    }


    @GetMapping("return_url")
    public String return_url(Double total_amount){

        String shuai = (String) redisTemplate.opsForValue().get("shuai");
        long l = Long.parseLong(shuai);

        User user = new User();
        user.setUid(l);
        user.setYue(total_amount);

        userService.update(user);
        return "chongzhi";
    }



















}
