package com.danchey.traffic.service;

import java.util.List;

import com.danchey.traffic.pojo.Roadstate;

public interface RoadStateService {
	
	public List<Roadstate> selectRoadList();
	
	//����һ������
	public int insertOne(Roadstate roadstate);

}
