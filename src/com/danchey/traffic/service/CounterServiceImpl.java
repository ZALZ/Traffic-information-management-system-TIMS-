package com.danchey.traffic.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.CounterAdvance;
import com.danchey.traffic.mapper.CounterMapper;
import com.danchey.traffic.pojo.CounterAndLocation;
import com.danchey.traffic.pojo.Pedestrianflow;

@Service
public class CounterServiceImpl implements CounterService {
	@Autowired
	private CounterMapper counterMapper;

	@Override
	public Pedestrianflow selectTotal() {
		// TODO Auto-generated method stub
		Pedestrianflow total = counterMapper.selectTotal();
		return total;
	}

	@Override
	public List<Pedestrianflow> selectAllGroupBySurveyTime() {
		// TODO Auto-generated method stub
		List<Pedestrianflow> list = counterMapper.selectAllGroupBySurveyTime();
		return list;
	}

	@Override
	public Pedestrianflow selectByNormalIDandNumber(CounterAdvance advance) {
		// TODO Auto-generated method stub
		Pedestrianflow pedestrianflow2 = counterMapper.selectByNormalIDandNumber(advance);
		return pedestrianflow2;
	}

	@Override
	public List<Pedestrianflow> selectByNormalIDandNumberGroupBySurveyTime(CounterAdvance advance) {
		// TODO Auto-generated method stub
		List<Pedestrianflow> list = counterMapper.selectByNormalIDandNumberGroupBySurveyTime(advance);
		return list;
	}

	@Override
	public List<CounterAndLocation> selectAllJoinLocation() {
		// TODO Auto-generated method stub
		List<CounterAndLocation> list = counterMapper.selectAllAndLocation();
		for (CounterAndLocation counterAndLocation : list) {
			counterAndLocation.getLocation().replace("&", ",");
		}
		return list;
	}

	

}
