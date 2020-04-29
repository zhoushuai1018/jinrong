package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.ShenheMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.ShenheExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShenheService {
    @Autowired
    private ShenheMapper shenheMapper;


    public List findAll() {
        return shenheMapper.selectByExample(new ShenheExample());
    }
}
