package com.bw.dao.mapper;

import com.bw.pojo.Type;
import com.bw.pojo.TypeExample;
import java.util.List;

import com.bw.pojo.vo.All;
import org.apache.ibatis.annotations.Param;

public interface TypeMapper {
    long countByExample(TypeExample example);

    int deleteByExample(TypeExample example);

    int deleteByPrimaryKey(Long tid);

    int insert(Type record);

    int insertSelective(Type record);

    List<Type> selectByExample(TypeExample example);

    Type selectByPrimaryKey(Long tid);

    int updateByExampleSelective(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByExample(@Param("record") Type record, @Param("example") TypeExample example);

    int updateByPrimaryKeySelective(Type record);

    int updateByPrimaryKey(Type record);

    List findTypeAndRateList();

    All findTypeAndRateOne(Long tid);
}