package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/rate")
@RestController
public class RateController {
    @Autowired
    private RateService rateService;

    @RequestMapping("/findAll")
    private List findAll(){
        return rateService.findAll();
    }
}
