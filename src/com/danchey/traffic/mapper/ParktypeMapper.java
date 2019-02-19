package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Parktype;
import com.danchey.traffic.pojo.ParktypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ParktypeMapper {
    int countByExample(ParktypeExample example);

    int deleteByExample(ParktypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Parktype record);

    int insertSelective(Parktype record);

    List<Parktype> selectByExample(ParktypeExample example);

    Parktype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Parktype record, @Param("example") ParktypeExample example);

    int updateByExample(@Param("record") Parktype record, @Param("example") ParktypeExample example);

    int updateByPrimaryKeySelective(Parktype record);

    int updateByPrimaryKey(Parktype record);
}