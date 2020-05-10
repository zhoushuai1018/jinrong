package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.DingdanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/dingdan")
@RestController
@CrossOrigin
public class DingdanController {
    @Autowired
    private DingdanService dingdanService;

    @RequestMapping("/findAll")
    private List findAll(){
        return dingdanService.findAll();
    }

    @RequestMapping("/findDingdan")
    private List findDingdan(@RequestParam("uid")Long uid){
        return dingdanService.findDingdan(uid);
    }

}
