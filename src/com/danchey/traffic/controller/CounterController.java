package com.danchey.traffic.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danchey.traffic.controller.advance.CounterAdvance;
import com.danchey.traffic.pojo.CounterAndLocation;
import com.danchey.traffic.pojo.Pedestrianflow;
import com.danchey.traffic.service.CounterService;

@Controller
@RequestMapping(value = "/counter")
public class CounterController {
	@Autowired
	private CounterService counterService;
	
	@RequestMapping(value = "/selectTotal.do")
	public @ResponseBody Pedestrianflow selectTotal(CounterAdvance advance, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		Pedestrianflow selectTotal = counterService.selectTotal();
		return selectTotal;
	}
	
	@RequestMapping(value = "/selectAllGroupBySurveyTime.do")
	public @ResponseBody List<Pedestrianflow> selectAllGroupBySurveyTime(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Pedestrianflow> list = counterService.selectAllGroupBySurveyTime();
		return list;
	}
	
	@RequestMapping(value = "/selectByNormalIDandNumber.do")
	public @ResponseBody Pedestrianflow selectByNormalIDandNumber(CounterAdvance advance, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		Pedestrianflow pedestrianflow = counterService.selectByNormalIDandNumber(advance);
		return pedestrianflow;
	}
	
	@RequestMapping(value = "/selectByNormalIDandNumberGroupBySurveyTime.do")
	public @ResponseBody List<Pedestrianflow> selectByNormalIDandNumberGroupBySurveyTime(CounterAdvance advance, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Pedestrianflow> pedestrianflow = counterService.selectByNormalIDandNumberGroupBySurveyTime(advance);
		return pedestrianflow;
	}
	
	@RequestMapping(value = "/selectAllJoinLocation.do")
	public @ResponseBody HashMap<String, List<CounterAndLocation>> selectAllJoinLocation(CounterAdvance advance, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<CounterAndLocation> list = counterService.selectAllJoinLocation();
		HashMap<String, List<CounterAndLocation>> hashMap = new HashMap<String,List<CounterAndLocation>>();
		hashMap.put("data", list);
		return hashMap;
	}
	
}
