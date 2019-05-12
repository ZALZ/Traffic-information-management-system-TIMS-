package com.danchey.traffic.service;

import com.danchey.traffic.controller.advance.RoundAdvanceAttr;
import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.Roundabout;
import com.github.pagehelper.PageInfo;

public interface RoundService {
	
	public int insert(Roundabout roundabout);
	
	public int updata(Roundabout roundabout);
	
	public int deleteByPrimaryKey(int id);
	
	public Roundabout selectByPrimaryKey(int id);
	
	public PageInfo selectByAdvance(RoundAdvanceAttr advance);

}
