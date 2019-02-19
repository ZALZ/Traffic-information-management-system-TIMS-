package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Areatype;
import com.danchey.traffic.pojo.AreatypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AreatypeMapper {
    int countByExample(AreatypeExample example);

    int deleteByExample(AreatypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Areatype record);

    int insertSelective(Areatype record);

    List<Areatype> selectByExample(AreatypeExample example);

    Areatype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Areatype record, @Param("example") AreatypeExample example);

    int updateByExample(@Param("record") Areatype record, @Param("example") AreatypeExample example);

    int updateByPrimaryKeySelective(Areatype record);

    int updateByPrimaryKey(Areatype record);
}