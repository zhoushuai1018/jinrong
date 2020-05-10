package com.bw.service;

import com.bw.dao.mapper.UserMapper;
import com.bw.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ZhifuService {
    @Autowired
    private UserMapper mapper;


    public void chongzhi(User user) {

        mapper.chongzhi(user);
    }
}
