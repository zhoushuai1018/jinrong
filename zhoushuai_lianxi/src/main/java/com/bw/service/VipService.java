package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.VipMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.Vip;
import com.bw.pojo.VipExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VipService {
    @Autowired
    private VipMapper vipMapper;


    public List findAll() {
        return vipMapper.selectByExample(new VipExample());
    }


    public Vip findOne(Long vid) {
        return vipMapper.selectByPrimaryKey(vid);
    }
}
