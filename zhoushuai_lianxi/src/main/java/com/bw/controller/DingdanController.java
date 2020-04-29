package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.DingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/dingdan")
@RestController
public class DingdanController {
    @Autowired
    private DingdanService dingdanService;

    @RequestMapping("/findAll")
    private List findAll(){
        return dingdanService.findAll();
    }
}
