package com.danchey.traffic.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.danchey.traffic.mapper.AlltypeMapper;
import com.danchey.traffic.mapper.RoadstateMapper;
import com.danchey.traffic.pojo.Alltype;
import com.danchey.traffic.pojo.RoadStateQueryVo;
import com.danchey.traffic.pojo.Roadstate;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoadStateQueryVoServiceImpl implements RoadStateQueryVoService {

	private static final List<Roadstate> Page = null;

	@Autowired
	private RoadstateMapper roadstateMapper;
	
	@Autowired
	private AlltypeMapper alltypeMapper;
	
	
	@Override
	public List<RoadStateQueryVo> selectAll() {
		// TODO Auto-generated method stub
		List<RoadStateQueryVo> roadStateQueryVoList = new ArrayList<RoadStateQueryVo>();
		List<Roadstate> roadList = roadstateMapper.selectByExample(null);
		for (Roadstate roadstate : roadList) {
			Alltype roadLevel = alltypeMapper.selectByPrimaryKey(roadstate.getRoadlevelId());
			Alltype roadBedType = alltypeMapper.selectByPrimaryKey(roadstate.getRoadbedtypeId());
			roadStateQueryVoList.add(new RoadStateQueryVo(roadstate, roadLevel, roadBedType));
			System.out.println(roadstate.getId());
		}
		
		return roadStateQueryVoList;
	}

	@Override
	public RoadStateQueryVo selectByRoadId(int id) {
		// TODO Auto-generated method stub
		Roadstate roadstate = roadstateMapper.selectByPrimaryKey(id);
		Alltype roadLeve = alltypeMapper.selectByPrimaryKey(roadstate.getRoadlevelId());
		Alltype roadbed = alltypeMapper.selectByPrimaryKey(roadstate.getRoadbedtypeId());
		RoadStateQueryVo roadVo = new RoadStateQueryVo(roadstate, roadLeve, roadbed);
		return roadVo;
	}

	@Override
	public List<RoadStateQueryVo> selectByRoadLevelId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoadStateQueryVo> selectByRoadBedTypelId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RoadStateQueryVo> selectByPage(Integer page,Model model) {
		// TODO Auto-generated method stub
		Alltype roadbed = null;
		Alltype roadLeve = null;
		
		PageHelper.startPage(7,13);
		List<Roadstate> roadList = roadstateMapper.selectByExample(null);
		List<RoadStateQueryVo> roadStateQueryVoList = new ArrayList<RoadStateQueryVo>();
		HashMap<Integer, Alltype> alltypeMap = new HashMap<Integer, Alltype>();
		for (Roadstate roadstate : roadList) {
			if(alltypeMap.containsKey(roadstate.getRoadlevelId())) {
				roadLeve = alltypeMap.get(roadstate.getRoadlevelId());
			}else {
				roadLeve = alltypeMapper.selectByPrimaryKey(roadstate.getRoadlevelId());
			}
			
			if(alltypeMap.containsKey(roadstate.getRoadlevelId())) {
				roadbed = alltypeMap.get(roadstate.getRoadbedtypeId());
			}else {
				roadbed = alltypeMapper.selectByPrimaryKey(roadstate.getRoadbedtypeId());
			}
			
			RoadStateQueryVo roadVo = new RoadStateQueryVo(roadstate, roadLeve, roadbed);
			roadStateQueryVoList.add(roadVo);
		}

		Page info = (Page) roadList;
		System.out.println("endrow: "+info.getEndRow());
		System.out.println("getOrderBy: "+info.getOrderBy());
		System.out.println("getPageNum: "+info.getPageNum());
		System.out.println("getPages"+info.getPages());
		System.out.println("getPageSize: "+info.getPageSize());
		System.out.println("getStartRow: "+info.getStartRow());
		System.out.println("getTotal: "+info.getTotal());
		System.out.println("getPageSizeZero: "+info.getPageSizeZero());
		
//		model.addAttribute("totle", info.)
		
		return roadStateQueryVoList;
	}

}
