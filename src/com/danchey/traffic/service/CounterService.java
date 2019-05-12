package com.danchey.traffic.service;

import java.util.List;

import com.danchey.traffic.controller.advance.CounterAdvance;
import com.danchey.traffic.pojo.CounterAndLocation;
import com.danchey.traffic.pojo.Pedestrianflow;

public interface CounterService {
	
	public Pedestrianflow selectTotal();
	
	public List<Pedestrianflow> selectAllGroupBySurveyTime();
	
	public Pedestrianflow selectByNormalIDandNumber(CounterAdvance advance);
	
	public List<Pedestrianflow> selectByNormalIDandNumberGroupBySurveyTime(CounterAdvance advance);
	
	public List<CounterAndLocation> selectAllJoinLocation();

}
