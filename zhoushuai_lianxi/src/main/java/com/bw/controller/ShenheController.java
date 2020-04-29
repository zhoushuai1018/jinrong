package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.ShenheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/shenhe")
@RestController
public class ShenheController {
    @Autowired
    private ShenheService shenheService;

    @RequestMapping("/findAll")
    private List findAll(){
        return shenheService.findAll();
    }
}
