package com.bw.dao.mapper;

import com.bw.pojo.User;
import com.bw.pojo.Vip;
import com.bw.pojo.VipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface VipMapper {
    long countByExample(VipExample example);

    int deleteByExample(VipExample example);

    int deleteByPrimaryKey(Long vid);

    int insert(Vip record);

    int insertSelective(Vip record);

    List<Vip> selectByExample(VipExample example);

    Vip selectByPrimaryKey(Long vid);

    int updateByExampleSelective(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByExample(@Param("record") Vip record, @Param("example") VipExample example);

    int updateByPrimaryKeySelective(Vip record);

    int updateByPrimaryKey(Vip record);

    Vip findEnd(User user);
}