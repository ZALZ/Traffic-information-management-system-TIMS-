package com.danchey.traffic.mapper;

import com.danchey.traffic.pojo.Controltype;
import com.danchey.traffic.pojo.ControltypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ControltypeMapper {
    int countByExample(ControltypeExample example);

    int deleteByExample(ControltypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Controltype record);

    int insertSelective(Controltype record);

    List<Controltype> selectByExample(ControltypeExample example);

    Controltype selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Controltype record, @Param("example") ControltypeExample example);

    int updateByExample(@Param("record") Controltype record, @Param("example") ControltypeExample example);

    int updateByPrimaryKeySelective(Controltype record);

    int updateByPrimaryKey(Controltype record);
}