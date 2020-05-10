package com.bw.controller;

import com.bw.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bw.pojo.Type;
import com.bw.pojo.vo.All;
import com.bw.service.ChanpinService;
import com.bw.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/type")
@RestController
@CrossOrigin
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/findAll")
    private List findAll(){
        return typeService.findAll();
    }


    @RequestMapping("/findTypeAndRateList")
    private List findTypeAndRateList(){
        return typeService.findTypeAndRateList();
    }

    @GetMapping("findTypeAndRateOne/{tid}")
    private All findTypeAndRateOne(@PathVariable("tid")long tid){
        return typeService.findTypeAndRateOne(tid);
    }

    @PostMapping("updType")
    private void updType(@RequestBody All type){
        typeService.updType(type);
    }

}
