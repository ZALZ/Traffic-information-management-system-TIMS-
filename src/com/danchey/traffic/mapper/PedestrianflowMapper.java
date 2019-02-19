package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Pedestrianflow;
import com.danchey.traffic.pojo.PedestrianflowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PedestrianflowMapper {
    int countByExample(PedestrianflowExample example);

    int deleteByExample(PedestrianflowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Pedestrianflow record);

    int insertSelective(Pedestrianflow record);

    List<Pedestrianflow> selectByExample(PedestrianflowExample example);

    Pedestrianflow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Pedestrianflow record, @Param("example") PedestrianflowExample example);

    int updateByExample(@Param("record") Pedestrianflow record, @Param("example") PedestrianflowExample example);

    int updateByPrimaryKeySelective(Pedestrianflow record);

    int updateByPrimaryKey(Pedestrianflow record);
}