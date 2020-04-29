package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/type")
@RestController
public class TypeController {
    @Autowired
    private TypeService typeService;

    @RequestMapping("/findAll")
    private List findAll(){
        return typeService.findAll();
    }
}
