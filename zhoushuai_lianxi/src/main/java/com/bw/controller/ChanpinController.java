package com.bw.controller;

import com.bw.pojo.Chanpin;
import com.bw.pojo.vo.All;
import com.bw.service.ChanpinService;
import com.bw.service.UserService;
import com.bw.vo.ChanpinVuTypeVoRates;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/chanpin")
@RestController
@CrossOrigin
public class ChanpinController {
    @Autowired
    private ChanpinService chanpinService;

    @RequestMapping("/findAll")
    private List findAll(){
        return chanpinService.findAll();
    }

    @RequestMapping("/findChanPinById")
    public ChanpinVuTypeVoRates findChanPinById(@RequestParam("id") long id){
        return chanpinService.findChanPinById(id);
    }

    @RequestMapping("findChanpinAndTypeAndRate")
    private List findChanpinAndTypeAndRate(){
        return chanpinService.findChanpinAndTypeAndRate();
    }

    @RequestMapping("findChanpinAndTypeAndRateOne/{cid}")
    private All findChanpinAndTypeAndRateOne(@PathVariable("cid")Long cid){
        return chanpinService.findChanpinAndTypeAndRateOne(cid);
    }

    @PostMapping("updChanpin")
    private String updChanpin(@RequestBody Chanpin chanpin){
        chanpinService.updChanpin(chanpin);
        return "ok";
    }

    @RequestMapping("findMingxi")
    public All findMingxi(@RequestParam("tid")long tid){
        return chanpinService.findMingxi(tid);
    }


}
