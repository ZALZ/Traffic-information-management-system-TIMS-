package com.danchey.traffic.mapper;

import java.util.List;


import com.danchey.traffic.controller.advance.CounterAdvance;
import com.danchey.traffic.pojo.CounterAndLocation;
import com.danchey.traffic.pojo.Pedestrianflow;

public interface CounterMapper {

	Pedestrianflow selectTotal();
	
	List<Pedestrianflow> selectAllGroupBySurveyTime();
	
	Pedestrianflow selectByNormalIDandNumber(CounterAdvance advance);
	
	List<Pedestrianflow> selectByNormalIDandNumberGroupBySurveyTime(CounterAdvance advance);
	
	List<CounterAndLocation> selectAllAndLocation();
	

}
