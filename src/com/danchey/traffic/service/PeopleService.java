package com.danchey.traffic.service;

import java.util.List;

import com.danchey.traffic.controller.advance.FlowAdvance;
import com.danchey.traffic.controller.advance.ParkAdvance;
import com.danchey.traffic.pojo.Park;
import com.danchey.traffic.pojo.Pedestrianflow;
import com.github.pagehelper.PageInfo;

public interface PeopleService {
	
	int insert(Pedestrianflow flow);
	
	public int updata(Pedestrianflow flow);
	
	public int deleteByPrimaryKey(int id);
	
	public Pedestrianflow selectByPrimaryKey(int id);
	
	public PageInfo selectByAdvance(FlowAdvance advance);
	
	

}
