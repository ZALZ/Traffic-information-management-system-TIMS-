package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.pojo.RoadstateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoadstateMapper {
    int countByExample(RoadstateExample example);

    int deleteByExample(RoadstateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Roadstate record);

    int insertSelective(Roadstate record);

    List<Roadstate> selectByExample(RoadstateExample example);

    Roadstate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Roadstate record, @Param("example") RoadstateExample example);

    int updateByExample(@Param("record") Roadstate record, @Param("example") RoadstateExample example);

    int updateByPrimaryKeySelective(Roadstate record);

    int updateByPrimaryKey(Roadstate record);
}