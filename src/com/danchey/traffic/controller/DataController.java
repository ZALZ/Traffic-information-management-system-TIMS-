package com.danchey.traffic.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danchey.traffic.mapper.NormalintersectionMapper;
import com.danchey.traffic.mapper.OverpassMapper;
import com.danchey.traffic.mapper.ParkMapper;
import com.danchey.traffic.mapper.PedestrianflowMapper;
import com.danchey.traffic.mapper.RoadstateMapper;
import com.danchey.traffic.mapper.RoundaboutMapper;
import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.Overpass;
import com.danchey.traffic.pojo.Park;
import com.danchey.traffic.pojo.Pedestrianflow;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.pojo.Roundabout;

@Controller
@RequestMapping(value = "/data")
public class DataController {
	@Autowired
	private RoadstateMapper roadMapper;
	
	@Autowired
	private NormalintersectionMapper normalMapper;
	
	@Autowired
	private OverpassMapper overpassMapper;
	
	@Autowired
	private RoundaboutMapper roundaboutMapper;
	
	@Autowired
	private ParkMapper parkMapper;
	
	@Autowired
	private PedestrianflowMapper pedestrianflowMapper;
	
	@RequestMapping(value = "/getAllRoad.do")
	public @ResponseBody List<Roadstate> getAllRoad(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Roadstate> list = roadMapper.selectByExample(null);
		return list;
	}
	
	@RequestMapping(value = "/getAllNormal.do")
	public @ResponseBody List<Normalintersection> getAllNormal(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Normalintersection> list = normalMapper.selectByExample(null);
		return list;
	}
	
	@RequestMapping(value = "/getAllRoundabout.do")
	public @ResponseBody List<Roundabout> getAllRoundabout(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Roundabout> list = roundaboutMapper.selectByExample(null);
		return list;
	}
	
	@RequestMapping(value = "/getAllOverpass.do")
	public @ResponseBody List<Overpass> getAllOverpass(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Overpass> list = overpassMapper.selectByExample(null);
		return list;
	}
	
	@RequestMapping(value = "/getAllPark.do")
	public @ResponseBody List<Park> getAllPark(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Park> list = parkMapper.selectByExample(null);
		return list;
	}
	
	@RequestMapping(value = "/getAllPeopleflow.do")
	public @ResponseBody List<Pedestrianflow> getAllPeopleflow(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		List<Pedestrianflow> list = pedestrianflowMapper.selectByExample(null);
		return list;
	}
	
	

}
