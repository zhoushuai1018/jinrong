package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.DingdanMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.DingdanExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DingdanService {
    @Autowired
    private DingdanMapper dingdanMapper;


    public List findAll() {
        return dingdanMapper.selectByExample(new DingdanExample());
    }
}
