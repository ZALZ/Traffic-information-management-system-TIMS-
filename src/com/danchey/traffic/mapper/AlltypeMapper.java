package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Alltype;
import com.danchey.traffic.pojo.AlltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AlltypeMapper {
    int countByExample(AlltypeExample example);

    int deleteByExample(AlltypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Alltype record);

    int insertSelective(Alltype record);

    List<Alltype> selectByExampleWithBLOBs(AlltypeExample example);

    List<Alltype> selectByExample(AlltypeExample example);

    Alltype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Alltype record, @Param("example") AlltypeExample example);

    int updateByExampleWithBLOBs(@Param("record") Alltype record, @Param("example") AlltypeExample example);

    int updateByExample(@Param("record") Alltype record, @Param("example") AlltypeExample example);

    int updateByPrimaryKeySelective(Alltype record);

    int updateByPrimaryKeyWithBLOBs(Alltype record);

    int updateByPrimaryKey(Alltype record);
}