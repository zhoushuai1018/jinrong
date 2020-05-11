package com.bw.dao.mapper;

import com.bw.pojo.Chanpin;
import com.bw.pojo.ChanpinExample;
import com.bw.pojo.vo.All;
import com.bw.vo.ChanpinVuTypeVoRates;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ChanpinMapper {
    long countByExample(ChanpinExample example);

    int deleteByExample(ChanpinExample example);

    int deleteByPrimaryKey(Long cid);

    int insert(Chanpin record);

    int insertSelective(Chanpin record);

    List<Chanpin> selectByExample(ChanpinExample example);

    Chanpin selectByPrimaryKey(Long cid);

    int updateByExampleSelective(@Param("record") Chanpin record, @Param("example") ChanpinExample example);

    int updateByExample(@Param("record") Chanpin record, @Param("example") ChanpinExample example);

    int updateByPrimaryKeySelective(Chanpin record);

    int updateByPrimaryKey(Chanpin record);

    List findChanpinAndTypeAndRate();

    All findChanpinAndTypeAndRateOne(Long cid);

    Chanpin findByChanpin(Long tid);

    All findMingxi(long tid);


    All isUpdate(Chanpin chanpin);

    ChanpinVuTypeVoRates findChanPinById(@Param("id") long id);
}