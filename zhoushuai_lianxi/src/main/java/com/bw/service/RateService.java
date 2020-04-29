package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.RatesMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.RatesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateService {
    @Autowired
    private RatesMapper ratesMapper;


    public List findAll() {
        return ratesMapper.selectByExample(new RatesExample());
    }
}
