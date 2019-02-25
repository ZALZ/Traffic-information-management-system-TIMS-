package com.danchey.traffic.service;

import java.util.List;

import com.danchey.traffic.pojo.Roadstate;

public interface RoadStateService {
	
	public List<Roadstate> selectRoadList();
	
	//插入一行数据
	public int insertOne(Roadstate roadstate);

}
