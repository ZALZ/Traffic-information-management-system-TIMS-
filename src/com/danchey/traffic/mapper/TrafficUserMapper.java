package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.TrafficUser;
import com.danchey.traffic.pojo.TrafficUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrafficUserMapper {
    int countByExample(TrafficUserExample example);

    int deleteByExample(TrafficUserExample example);

    int deleteByPrimaryKey(String username);

    int insert(TrafficUser record);

    int insertSelective(TrafficUser record);

    List<TrafficUser> selectByExample(TrafficUserExample example);

    TrafficUser selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") TrafficUser record, @Param("example") TrafficUserExample example);

    int updateByExample(@Param("record") TrafficUser record, @Param("example") TrafficUserExample example);

    int updateByPrimaryKeySelective(TrafficUser record);

    int updateByPrimaryKey(TrafficUser record);
}