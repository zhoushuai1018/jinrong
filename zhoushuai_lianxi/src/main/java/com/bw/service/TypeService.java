package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.RatesMapper;
import com.bw.dao.mapper.TypeMapper;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.Rates;
import com.bw.pojo.Type;
import com.bw.pojo.TypeExample;
import com.bw.pojo.vo.All;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class TypeService {
    @Autowired
    private TypeMapper typeMapper;

    @Autowired
    private RatesMapper ratesMapper;


    public List findAll() {
        return typeMapper.selectByExample(new TypeExample());
    }

    public List findTypeAndRateList() {
        return typeMapper.findTypeAndRateList();
    }


    public All findTypeAndRateOne(Long tid) {
        return typeMapper.findTypeAndRateOne(tid);
    }

    public void updType(All all) {
        Rates rates = new Rates();
        rates.setLilv(all.getLilv());
        rates.setUid(all.getTid());
        rates.setUdate(new Date());
        ratesMapper.addRate(rates);
        Type type = new Type();
        type.setTid(all.getTid());
        type.setMonth(all.getMonth());
        type.setLid(rates.getLid());
        type.setCid(all.getCid());
        typeMapper.updateByPrimaryKeySelective(type);
    }
}
