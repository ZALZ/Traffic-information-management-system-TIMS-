package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.NormalintersectionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NormalintersectionMapper {
    int countByExample(NormalintersectionExample example);

    int deleteByExample(NormalintersectionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Normalintersection record);

    int insertSelective(Normalintersection record);

    List<Normalintersection> selectByExample(NormalintersectionExample example);

    Normalintersection selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Normalintersection record, @Param("example") NormalintersectionExample example);

    int updateByExample(@Param("record") Normalintersection record, @Param("example") NormalintersectionExample example);

    int updateByPrimaryKeySelective(Normalintersection record);

    int updateByPrimaryKey(Normalintersection record);
}