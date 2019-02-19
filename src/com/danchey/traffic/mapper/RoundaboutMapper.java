package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Roundabout;
import com.danchey.traffic.pojo.RoundaboutExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoundaboutMapper {
    int countByExample(RoundaboutExample example);

    int deleteByExample(RoundaboutExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roundabout record);

    int insertSelective(Roundabout record);

    List<Roundabout> selectByExample(RoundaboutExample example);

    Roundabout selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roundabout record, @Param("example") RoundaboutExample example);

    int updateByExample(@Param("record") Roundabout record, @Param("example") RoundaboutExample example);

    int updateByPrimaryKeySelective(Roundabout record);

    int updateByPrimaryKey(Roundabout record);
}