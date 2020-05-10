package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.TypeMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.TypeExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeService {
    @Autowired
    private TypeMapper typeMapper;


    public List findAll() {
        return typeMapper.findAll();
    }
}
