package com.bw.controller;

import com.bw.service.ChanpinService;
import com.bw.service.UserService;
import com.bw.vo.ChanpinVuTypeVoRates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

}
