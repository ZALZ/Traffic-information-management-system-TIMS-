package com.danchey.traffic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.RoundAdvanceAttr;
import com.danchey.traffic.mapper.RoundaboutMapper;
import com.danchey.traffic.pojo.Roundabout;
import com.danchey.traffic.pojo.RoundaboutExample;
import com.danchey.traffic.pojo.RoundaboutExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoundServiceImpl implements RoundService {

	@Autowired
	private RoundaboutMapper roundMapper;

	@Override
	public int insert(Roundabout roundabout) {
		// TODO Auto-generated method stub
		int insert = roundMapper.insert(roundabout);
		return insert;
	}

	@Override
	public int updata(Roundabout roundabout) {
		// TODO Auto-generated method stub
		int line = roundMapper.updateByPrimaryKeySelective(roundabout);
		return line;
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		int line = roundMapper.deleteByPrimaryKey(id);
		return line;
	}

	@Override
	public Roundabout selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		Roundabout roundabout = roundMapper.selectByPrimaryKey(id);
		return roundabout;
	}

	@Override
	public PageInfo selectByAdvance(RoundAdvanceAttr advance) {
		// TODO Auto-generated method stub
		RoundaboutExample example = new RoundaboutExample();
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
//	    private Integer minIntonumber;
		if(advance.getMinIntonumber()!=null){
			criteria.andIntonumberGreaterThanOrEqualTo(advance.getMinIntonumber());
		}
		if(advance.getMaxIntonumber()!=null){
			criteria.andUpdatetimeLessThanOrEqualTo(advance.getMaxupdatetime());
		}
//	    private BigDecimal radius;
		if(advance.getMinradius()!=null){
			criteria.andRadiusGreaterThanOrEqualTo(advance.getMinradius());
		}
		if(advance.getMaxradius()!=null){
			criteria.andRadiusLessThanOrEqualTo(advance.getMaxradius());
		}
//	    private BigDecimal turningwidth;		
		if(advance.getMinturningwidth()!=null){
			criteria.andTurningwidthGreaterThanOrEqualTo(advance.getMinturningwidth());
		}
		if(advance.getMaxturningwidth()!=null){
			criteria.andTurningwidthLessThanOrEqualTo(advance.getMaxturningwidth());
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
		PageHelper.startPage(page, 13);
		List<Roundabout> list = roundMapper.selectByExample(example);
		
		PageInfo info = new PageInfo(list);

		return info;
	}

}
