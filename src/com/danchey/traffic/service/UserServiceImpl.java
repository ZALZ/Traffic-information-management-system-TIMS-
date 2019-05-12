package com.danchey.traffic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.mapper.TrafficUserMapper;
import com.danchey.traffic.pojo.TrafficUser;
import com.danchey.traffic.pojo.TrafficUserExample;
import com.danchey.traffic.pojo.TrafficUserExample.Criteria;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private TrafficUserMapper userMapper;
	
	@Override
	public Boolean checkUser(TrafficUser user) {
		// TODO Auto-generated method stub
		//session
		TrafficUserExample example = new TrafficUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andUsernameEqualTo(user.getUsername());
		criteria.andPasswordEqualTo(user.getPassword());
		List<TrafficUser> list = userMapper.selectByExample(example);
		if(!list.isEmpty())
			return true;
		else
			return false;
	}

	@Override
	public Boolean regist(TrafficUser user) {
		// TODO Auto-generated method stub
		try {
			int insert = userMapper.insert(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		
	}

}
