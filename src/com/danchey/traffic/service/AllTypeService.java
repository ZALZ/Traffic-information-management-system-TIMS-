package com.danchey.traffic.service;

import com.danchey.traffic.pojo.Alltype;

public interface AllTypeService {
	
	public Alltype selectById(Integer id);
	
	public void insert(Alltype record);

}
