package com.bw.service;

import com.bw.dao.mapper.ChanpinMapper;
import com.bw.dao.mapper.UserMapper;
import com.bw.pojo.Chanpin;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.UserExample;
import com.bw.vo.ChanpinVuTypeVoRates;
import com.bw.pojo.vo.All;
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

    public ChanpinVuTypeVoRates findChanPinById(long id) {
        return chanpinMapper.findChanPinById(id);
    }
    public List findChanpinAndTypeAndRate() {
        return chanpinMapper.findChanpinAndTypeAndRate();
    }

    public All findChanpinAndTypeAndRateOne(Long cid) {
        return chanpinMapper.findChanpinAndTypeAndRateOne(cid);
    }

    public void updChanpin(Chanpin chanpin) {
            All all = chanpinMapper.isUpdate(chanpin);
            if (all==null){
                chanpinMapper.updateByPrimaryKey(chanpin);
            }

    }

    public All findMingxi(long tid) {

        return chanpinMapper.findMingxi(tid);
    }
}
