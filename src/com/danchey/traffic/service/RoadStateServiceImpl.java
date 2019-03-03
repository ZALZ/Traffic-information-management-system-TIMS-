package com.danchey.traffic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.mapper.RoadstateMapper;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.pojo.RoadstateExample;
import com.danchey.traffic.pojo.RoadstateExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoadStateServiceImpl implements RoadStateService {
	
	@Autowired
	private RoadstateMapper roadstateMapper;
	
	@Override
	public List<Roadstate> selectAllRoadList() {
		// TODO Auto-generated method stub
		
		List<Roadstate> roadList = roadstateMapper.selectByExample(null);
		
		return roadList;
	}

	@Override
	public int insert(Roadstate roadstate) {
		// TODO Auto-generated method stub
		int line = roadstateMapper.insert(roadstate);
		return line;
	}

	@Override
	public int updata(Roadstate roadstate) {
		// TODO Auto-generated method stub
		int up = roadstateMapper.updateByPrimaryKeySelective(roadstate);
		return up;
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		int line = roadstateMapper.deleteByPrimaryKey(id);
		return line;
	}

	@Override
	public List<Roadstate> selectByPage(int page) {
		// TODO Auto-generated method stub
		if(page<=0) {
			page=1;
		}
		PageHelper.startPage(page,12);
		List<Roadstate> roadList = roadstateMapper.selectByExample(null);
		int i = 1;
		for (Roadstate roadstate : roadList) {
			System.out.println(i+roadstate.getRoadname());
		}
		return null;
	}

}
