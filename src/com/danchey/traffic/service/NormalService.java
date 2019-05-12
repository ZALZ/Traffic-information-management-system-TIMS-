package com.danchey.traffic.service;

import com.danchey.traffic.controller.advance.NormalAdvanceAttr;
import com.danchey.traffic.pojo.Normalintersection;
import com.github.pagehelper.PageInfo;

public interface NormalService {

	public int insert(Normalintersection normalintersection);
	

	public int updata(Normalintersection normalintersection);
	
	public int deleteByPrimaryKey(int id);
	
	public Normalintersection selectByPrimaryKey(int id);
	
	public PageInfo selectByAdvance(NormalAdvanceAttr advance);
	
}
