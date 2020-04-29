package com.bw.service;

import com.bw.dao.mapper.UserMapper;
import com.bw.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public List findAll() {
        return userMapper.selectByExample(new UserExample());
    }
}
