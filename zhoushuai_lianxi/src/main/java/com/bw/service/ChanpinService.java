package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.UserMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChanpinService {
    @Autowired
    private ChanpinMapper chanpinMapper;


    public List findAll() {
        return chanpinMapper.selectByExample(new ChanpinExample());
    }
}
