package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Overpass;
import com.danchey.traffic.pojo.OverpassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OverpassMapper {
    int countByExample(OverpassExample example);

    int deleteByExample(OverpassExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Overpass record);

    int insertSelective(Overpass record);

    List<Overpass> selectByExample(OverpassExample example);

    Overpass selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Overpass record, @Param("example") OverpassExample example);

    int updateByExample(@Param("record") Overpass record, @Param("example") OverpassExample example);

    int updateByPrimaryKeySelective(Overpass record);

    int updateByPrimaryKey(Overpass record);
}