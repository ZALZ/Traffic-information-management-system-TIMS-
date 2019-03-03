package com.danchey.traffic.service;

import java.util.List;

import org.springframework.ui.Model;

import com.danchey.traffic.pojo.RoadStateQueryVo;

public interface RoadStateQueryVoService {
	//查询所有
	public List<RoadStateQueryVo> selectAll();
	//查询单条记录
	public RoadStateQueryVo selectByRoadId(int id);
	//通过道路等级查询
	public List<RoadStateQueryVo> selectByRoadLevelId(Integer id);
	//通过路面类型查询
	public List<RoadStateQueryVo> selectByRoadBedTypelId(Integer id);
	
	public List<RoadStateQueryVo> selectByPage(Integer page,Model model);
	
}
