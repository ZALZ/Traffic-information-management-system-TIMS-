package com.danchey.traffic.service;

import java.util.List;

import com.danchey.traffic.controller.advance.RoadAdvance;
import com.danchey.traffic.controller.advance.RoundAdvanceAttr;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.pojo.Roundabout;
import com.github.pagehelper.PageInfo;

public interface RoadStateService {

	public int insert(Roadstate roadstate);

	public int updata(Roadstate roadstate);

	public int deleteByPrimaryKey(int id);

	public Roadstate selectByPrimaryKey(int id);

	public PageInfo selectByAdvance(RoadAdvance advance);

}
