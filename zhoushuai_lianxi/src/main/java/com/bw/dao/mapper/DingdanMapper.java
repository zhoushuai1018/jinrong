package com.bw.dao.mapper;

import com.bw.pojo.Dingdan;
import com.bw.pojo.DingdanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DingdanMapper {
    long countByExample(DingdanExample example);

    int deleteByExample(DingdanExample example);

    int deleteByPrimaryKey(Long did);

    int insert(Dingdan record);

    int insertSelective(Dingdan record);

    List<Dingdan> selectByExample(DingdanExample example);

    Dingdan selectByPrimaryKey(Long did);

    int updateByExampleSelective(@Param("record") Dingdan record, @Param("example") DingdanExample example);

    int updateByExample(@Param("record") Dingdan record, @Param("example") DingdanExample example);

    int updateByPrimaryKeySelective(Dingdan record);

    int updateByPrimaryKey(Dingdan record);

    List findDingdan(Long uid);
}