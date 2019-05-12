package com.danchey.traffic.service;

import com.danchey.traffic.controller.advance.OverpassAdvance;
import com.danchey.traffic.pojo.Overpass;
import com.github.pagehelper.PageInfo;

public interface OverpassService {
	
	public int insert(Overpass overpass);

	public int updata(Overpass overpass);
	
	public int deleteByPrimaryKey(int id);
	
	public Overpass selectByPrimaryKey(int id);
	
	public PageInfo selectByAdvance(OverpassAdvance advance);

}
