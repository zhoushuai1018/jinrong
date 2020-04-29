package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/chanpin")
@RestController
public class ChanpinController {
    @Autowired
    private ChanpinService chanpinService;

    @RequestMapping("/findAll")
    private List findAll(){
        return chanpinService.findAll();
    }
}
