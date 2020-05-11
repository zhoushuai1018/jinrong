package com.bw.controller;

import com.bw.pojo.Vip;
import com.bw.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/vip")
@RestController
@CrossOrigin
public class VipController {
    @Autowired
    private VipService vipService;

    @RequestMapping("/findAll")
    private List findAll(){
        return vipService.findAll();
    }

    @RequestMapping("/findOne")
    private Vip findOne(@RequestParam("vid")Long vid){
        return vipService.findOne(vid);
    }
}
