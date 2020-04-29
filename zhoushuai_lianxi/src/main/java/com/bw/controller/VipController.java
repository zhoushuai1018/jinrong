package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/vip")
@RestController
public class VipController {
    @Autowired
    private VipService vipService;

    @RequestMapping("/findAll")
    private List findAll(){
        return vipService.findAll();
    }
}
