package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.UserMapper;
import com.bw.dao.mapper.VipMapper;
import com.bw.pojo.Chanpin;
import com.bw.pojo.User;
import com.bw.pojo.UserExample;
import com.bw.pojo.Vip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private VipMapper vipMapper;
    
    @Autowired
    private ChanpinMapper chanpinMapper;

    public List findAll() {
        return userMapper.selectByExample(new UserExample());
    }

    public User getUserByUsername(User user) {
        return userMapper.getUserByUsername(user);
    }

    public void addUser(User user) {
        userMapper.insert(user);
    }

    public User findByUid(long uid) {
        return userMapper.selectByPrimaryKey(uid);
    }


    public void add(User user) {
        userMapper.inserUser(user);
    }

    public User login(User user) {
        return userMapper.findByNameAndPwd(user);
    }

    public User findOne(Long uid) {
        return userMapper.selectByPrimaryKey(uid);
    }


    public void update(User login) {
        userMapper.updateuser(login);
        User user = userMapper.selectByPrimaryKey(login.getUid());
        Vip vip = vipMapper.findEnd(user);
        if (vip!=null){
            user.setVid(vip.getVid());
            userMapper.updvid(user);
        }
    }

    public User logindingdan(User user) {
        return userMapper.findByNameAndPwd(user);
    }

    public void upYue(User login) {
        userMapper.upYue(login);
    }

    public User logindingdan(Long uid) {
        return userMapper.selectByPrimaryKey(uid);
    }

    public Chanpin findByCid(Long cid) {
        return chanpinMapper.selectByPrimaryKey(cid);
    }

    public void upChanPin(Chanpin chanpin) {
        userMapper.upChanPin(chanpin);
    }

    public void upChanPinStatus(Chanpin chanpin) {
        userMapper.upChanPinStatus(chanpin);
    }
}
