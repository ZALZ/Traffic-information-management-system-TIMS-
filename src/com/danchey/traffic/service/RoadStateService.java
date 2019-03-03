package com.danchey.traffic.service;

import java.util.List;

import com.danchey.traffic.pojo.Roadstate;

public interface RoadStateService {
	
	public List<Roadstate> selectAllRoadList();
	
	//插入一行数据
	public int insert(Roadstate roadstate);
	
	public int updata(Roadstate roadstate);
	
	public int deleteByPrimaryKey(int id);
	
	public List<Roadstate> selectByPage(int page);

}
