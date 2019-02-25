package com.danchey.traffic.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.mapper.RoadstateMapper;
import com.danchey.traffic.pojo.Roadstate;

@Service
public class RoadStateServiceImpl implements RoadStateService {

	@Autowired
	private RoadstateMapper roadstateMapper;
	
	public List<Roadstate> selectRoadList() {
		List<Roadstate> roadliList = roadstateMapper.selectByExample(null);
		
		return roadliList;
	}

	public int insertOne(Roadstate roadstate) {
		// TODO Auto-generated method stub
		return roadstateMapper.insert(roadstate);
			 
	}

}
