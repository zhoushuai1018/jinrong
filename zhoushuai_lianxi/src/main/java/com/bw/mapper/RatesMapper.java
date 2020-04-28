package com.bw.mapper;

import com.bw.pojo.Rates;
import com.bw.pojo.RatesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RatesMapper {
    long countByExample(RatesExample example);

    int deleteByExample(RatesExample example);

    int deleteByPrimaryKey(Long lid);

    int insert(Rates record);

    int insertSelective(Rates record);

    List<Rates> selectByExample(RatesExample example);

    Rates selectByPrimaryKey(Long lid);

    int updateByExampleSelective(@Param("record") Rates record, @Param("example") RatesExample example);

    int updateByExample(@Param("record") Rates record, @Param("example") RatesExample example);

    int updateByPrimaryKeySelective(Rates record);

    int updateByPrimaryKey(Rates record);
}