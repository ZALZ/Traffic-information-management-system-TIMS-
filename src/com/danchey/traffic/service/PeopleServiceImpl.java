package com.danchey.traffic.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.FlowAdvance;
import com.danchey.traffic.mapper.NormalintersectionMapper;
import com.danchey.traffic.mapper.PedestrianflowMapper;
import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.NormalintersectionExample;
import com.danchey.traffic.pojo.Pedestrianflow;
import com.danchey.traffic.pojo.PedestrianflowExample;
import com.danchey.traffic.pojo.PedestrianflowExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class PeopleServiceImpl implements PeopleService {
	@Autowired
	private PedestrianflowMapper pedestrianMapper;
	
	@Autowired
	private NormalintersectionMapper normalMapper;

	@Override
	public int insert(Pedestrianflow flow) {
		// TODO Auto-generated method stub
		int line = pedestrianMapper.insert(flow);
		return line;
	}

	@Override
	public int updata(Pedestrianflow flow) {
		// TODO Auto-generated method stub
		int line = pedestrianMapper.updateByPrimaryKeySelective(flow);
		return line;
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		int line = pedestrianMapper.deleteByPrimaryKey(id);
		return line;
	}

	@Override
	public Pedestrianflow selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		Pedestrianflow pedestrianflow = pedestrianMapper.selectByPrimaryKey(id);
		Normalintersection name = normalMapper.selectByPrimaryKey(pedestrianflow.getIntersectionId());
		pedestrianflow.setName(name.getName());
		return pedestrianflow;
	}

	@Override
	public PageInfo selectByAdvance(FlowAdvance advance) {
		// TODO Auto-generated method stub
		PedestrianflowExample example = new PedestrianflowExample();
		Criteria criteria = example.createCriteria();
		
		int page = advance.getPage() != null ? advance.getPage() : 1;
		
//		private Integer minId;
//		private Integer maxId;
		if (advance.getMinId() != null) {
			criteria.andIdGreaterThanOrEqualTo(advance.getMinId());
		}
		if (advance.getMaxId() != null) {
			criteria.andIdLessThanOrEqualTo(advance.getMaxId());
		}
//	    private Date minsurveytime;
//	    private Date maxsurveytime;
		if (advance.getMinsurveytime() != null) {
			criteria.andSurveytimeGreaterThanOrEqualTo(advance.getMinsurveytime());
		}
		if (advance.getMaxsurveytime() != null) {
			criteria.andSurveytimeLessThanOrEqualTo(advance.getMinsurveytime());
		}
//	    private Date mincreatetime;
//	    private Date mxacreatetime;
		if (advance.getMaxcreatetime() != null) {
			criteria.andCreatetimeLessThanOrEqualTo(advance.getMaxcreatetime());
		}
		if (advance.getMincreatetime() != null) {
			criteria.andCreatetimeGreaterThanOrEqualTo(advance.getMincreatetime());
		}
//	    private Date minupdatetime;
//	    private Date maxupdatetime;
		if (advance.getMinupdatetime() != null) {
			criteria.andUpdatetimeGreaterThanOrEqualTo(advance.getMinupdatetime());
		}
		if (advance.getMaxupdatetime() != null) {
			criteria.andUpdatetimeLessThanOrEqualTo(advance.getMaxupdatetime());
		}
//		private Integer intersectionId;
		if (advance.getName() != null) {
			NormalintersectionExample normalintersectionExample = new NormalintersectionExample();
			com.danchey.traffic.pojo.NormalintersectionExample.Criteria createCriteria = normalintersectionExample.createCriteria();
			createCriteria.andNameLike("%"+ advance.getName() +"%");
			List<Normalintersection> list = normalMapper.selectByExample(normalintersectionExample);
			List<Integer> ids = new ArrayList<Integer>();
			for (Normalintersection normalintersection : list) {
				ids.add(normalintersection.getId());
			}
			criteria.andIntersectionIdIn(ids);
		}
		
//	    private Integer mintotal;
//	    private Integer maxtotal;
		if (advance.getMintotal() != null) {
			criteria.andTotalGreaterThanOrEqualTo(advance.getMintotal());
		}
		if (advance.getMaxtotal() != null) {
			criteria.andTotalLessThanOrEqualTo(advance.getMaxtotal());
		}
//	    private Integer minviolation;
//	    private Integer maxviolation;
		if (advance.getMinviolation() != null) {
			criteria.andViolationGreaterThanOrEqualTo(advance.getMinviolation());
		}
		if (advance.getMaxviolation() != null) {
			criteria.andViolationLessThanOrEqualTo(advance.getMaxviolation());
		}
//	    private String creater;
		if (advance.getCreater() != null)
			criteria.andCreaterLike("%" + advance.getCreater() + "%");
//	    private String investigator;
		if (advance.getInvestigator() != null)
			criteria.andInvestigatorLike("%" + advance.getInvestigator() + "%");
		
		PageHelper.startPage(page, 13);
		List<Pedestrianflow> list = pedestrianMapper.selectByExample(example);
		HashMap<Integer, String> normalMap = new HashMap<>();
		for (Pedestrianflow pedestrianflow : list) {
			if(normalMap.containsKey(pedestrianflow.getIntersectionId())) {
				pedestrianflow.setName(normalMap.get(pedestrianflow.getIntersectionId()));
			}else {
				String name = normalMapper.selectByPrimaryKey(pedestrianflow.getIntersectionId()).getName();
				Integer id = pedestrianflow.getIntersectionId();
				normalMap.put(id, name);
				pedestrianflow.setName(name);
			}
		}
		
		PageInfo info = new PageInfo(list);
		return info;
	}
	
}
