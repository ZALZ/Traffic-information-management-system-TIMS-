package com.danchey.traffic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.mapper.AlltypeMapper;
import com.danchey.traffic.pojo.Alltype;

@Service
public class AllTypeServiceImpl implements AllTypeService {
	
	@Autowired
	private AlltypeMapper allTypeMapper;
	
	@Override
	public Alltype selectById(Integer id) {
		// TODO Auto-generated method stub
		Alltype atype = allTypeMapper.selectByPrimaryKey(id);
		return atype;
	}

	@Override
	public void insert(Alltype record) {
		// TODO Auto-generated method stub
		allTypeMapper.insert(record);
	}
	
	
	
}
