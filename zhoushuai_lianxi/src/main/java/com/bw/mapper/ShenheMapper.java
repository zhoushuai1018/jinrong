package com.bw.mapper;

import com.bw.pojo.Shenhe;
import com.bw.pojo.ShenheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShenheMapper {
    long countByExample(ShenheExample example);

    int deleteByExample(ShenheExample example);

    int deleteByPrimaryKey(Long sid);

    int insert(Shenhe record);

    int insertSelective(Shenhe record);

    List<Shenhe> selectByExample(ShenheExample example);

    Shenhe selectByPrimaryKey(Long sid);

    int updateByExampleSelective(@Param("record") Shenhe record, @Param("example") ShenheExample example);

    int updateByExample(@Param("record") Shenhe record, @Param("example") ShenheExample example);

    int updateByPrimaryKeySelective(Shenhe record);

    int updateByPrimaryKey(Shenhe record);
}