package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Roadbedtype;
import com.danchey.traffic.pojo.RoadbedtypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadbedtypeMapper {
    int countByExample(RoadbedtypeExample example);

    int deleteByExample(RoadbedtypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roadbedtype record);

    int insertSelective(Roadbedtype record);

    List<Roadbedtype> selectByExample(RoadbedtypeExample example);

    Roadbedtype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roadbedtype record, @Param("example") RoadbedtypeExample example);

    int updateByExample(@Param("record") Roadbedtype record, @Param("example") RoadbedtypeExample example);

    int updateByPrimaryKeySelective(Roadbedtype record);

    int updateByPrimaryKey(Roadbedtype record);
}