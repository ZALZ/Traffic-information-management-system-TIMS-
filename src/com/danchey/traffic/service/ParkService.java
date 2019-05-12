package com.danchey.traffic.service;

import com.danchey.traffic.controller.advance.OverpassAdvance;
import com.danchey.traffic.controller.advance.ParkAdvance;
import com.danchey.traffic.pojo.Overpass;
import com.danchey.traffic.pojo.Park;
import com.github.pagehelper.PageInfo;

public interface ParkService {
	
	public int insert(Park park);

	public int updata(Park park);
	
	public int deleteByPrimaryKey(int id);
	
	public Park selectByPrimaryKey(int id);
	
	public PageInfo selectByAdvance(ParkAdvance advance);

}
