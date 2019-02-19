package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Ramptype;
import com.danchey.traffic.pojo.RamptypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RamptypeMapper {
    int countByExample(RamptypeExample example);

    int deleteByExample(RamptypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Ramptype record);

    int insertSelective(Ramptype record);

    List<Ramptype> selectByExample(RamptypeExample example);

    Ramptype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Ramptype record, @Param("example") RamptypeExample example);

    int updateByExample(@Param("record") Ramptype record, @Param("example") RamptypeExample example);

    int updateByPrimaryKeySelective(Ramptype record);

    int updateByPrimaryKey(Ramptype record);
}