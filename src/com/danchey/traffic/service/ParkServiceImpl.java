package com.danchey.traffic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.ParkAdvance;
import com.danchey.traffic.mapper.ParkMapper;
import com.danchey.traffic.pojo.Park;
import com.danchey.traffic.pojo.ParkExample;
import com.danchey.traffic.pojo.ParkExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class ParkServiceImpl implements ParkService {
	@Autowired
	private ParkMapper parkmapper;

	@Override
	public int insert(Park park) {
		// TODO Auto-generated method stub
		int insert = parkmapper.insert(park);
		return insert;
	}

	@Override
	public int updata(Park park) {
		// TODO Auto-generated method stub
		int line = parkmapper.updateByPrimaryKeySelective(park);
		return line;
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		int line = parkmapper.deleteByPrimaryKey(id);
		return line;
	}

	@Override
	public Park selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		Park park = parkmapper.selectByPrimaryKey(id);
		return park;
	}

	@Override
	public PageInfo selectByAdvance(ParkAdvance advance) {
		// TODO Auto-generated method stub
		ParkExample example = new ParkExample();
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
//	    private String creater;
		if (advance.getCreater() != null)
			criteria.andCreaterLike("%" + advance.getCreater() + "%");
//	    private String investigator;
		if (advance.getInvestigator() != null)
			criteria.andInvestigatorLike("%" + advance.getInvestigator() + "%");
//	    private String name;
		if (advance.getName() != null)
			criteria.andNameLike("%" + advance.getName() + "%");
//	    private Integer mincatability;
//	    private Integer maxcatability;
		if (advance.getMincatability() != null) {
			criteria.andCatabilityGreaterThanOrEqualTo(advance.getMincatability());
		}
		if (advance.getMaxcatability() != null) {
			criteria.andCatabilityLessThanOrEqualTo(advance.getMaxcatability());
		}
//	    private Integer parktypeId;
		if (advance.getParktypeId() != null)
			criteria.andParktypeIdEqualTo(advance.getParktypeId());
//	    private String area;
		if (advance.getArea() != null)
			criteria.andAreaLike("%" + advance.getArea() + "%");
//	    private String classification;
		if (advance.getClassification() != null)
			criteria.andClassificationLike("%" + advance.getClassification() + "%");
		
		PageHelper.startPage(page, 13);
		List<Park> list = parkmapper.selectByExample(example);
		PageInfo info= new PageInfo(list);
		
		return info;
	}


}
