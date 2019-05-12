package com.danchey.traffic.service;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.RoadAdvance;
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
	public Roadstate selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		Roadstate roadstate = roadstateMapper.selectByPrimaryKey(id);
		return roadstate;
	}

	@Override
	public PageInfo selectByAdvance(RoadAdvance advance) {
		// TODO Auto-generated method stub
		RoadstateExample example = new RoadstateExample();
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
//	    private BigDecimal minlength;
//	    private BigDecimal maxlength;
		if (advance.getMinlength() != null) {
			criteria.andLengthGreaterThanOrEqualTo(advance.getMinlength());
		}
		if (advance.getMaxlength() != null) {
			criteria.andLengthLessThanOrEqualTo(advance.getMaxlength());
		}
//	    private BigDecimal minincline;
//	    private BigDecimal maxincline;
		if (advance.getMinincline() != null) {
			criteria.andInclineGreaterThanOrEqualTo(advance.getMinincline());
		}
		if (advance.getMaxincline() != null) {
			criteria.andInclineLessThanOrEqualTo(advance.getMaxincline());
		}
//	    private BigDecimal minmotorwaywidth;
//	    private BigDecimal maxmotorwaywidth;
		if (advance.getMinmotorwaywidth() != null) {
			criteria.andMotorwaywidthGreaterThanOrEqualTo(advance.getMinmotorwaywidth());
		}
		if (advance.getMaxmotorwaywidth() != null) {
			criteria.andMotorwaywidthLessThanOrEqualTo(advance.getMaxmotorwaywidth());
		}
//	    private BigDecimal minsuperwaywidth;
//	    private BigDecimal maxsuperwaywidth;
		if (advance.getMinsuperwaywidth() != null) {
			criteria.andSuperwaywidthGreaterThanOrEqualTo(advance.getMinsuperwaywidth());
		}
		if (advance.getMaxsuperwaywidth() != null) {
			criteria.andSuperwaywidthLessThanOrEqualTo(advance.getMaxsuperwaywidth());
		}
//	    private BigDecimal minpavementwidth;
//	    private BigDecimal maxpavementwidth;
		if (advance.getMinpavementwidth() != null) {
			criteria.andPavementwidthGreaterThanOrEqualTo(advance.getMinpavementwidth());
		}
		if (advance.getMaxpavementwidth() != null) {
			criteria.andPavementwidthLessThanOrEqualTo(advance.getMaxpavementwidth());
		}
//	    private BigDecimal minmedianwidth;
//	    private BigDecimal maxmedianwidth;
		if (advance.getMinmedianwidth() != null) {
			criteria.andMedianwidthGreaterThanOrEqualTo(advance.getMinmedianwidth());
		}
		if (advance.getMaxmedianwidth() != null) {
			criteria.andMedianwidthLessThanOrEqualTo(advance.getMaxmedianwidth());
		}
//	    private BigDecimal minsidesseparatebeltwidth;
//	    private BigDecimal maxsidesseparatebeltwidth;
		if (advance.getMinsidesseparatebeltwidth() != null) {
			criteria.andSidesseparatebeltwidthGreaterThanOrEqualTo(advance.getMinsidesseparatebeltwidth());
		}
		if (advance.getMaxsidesseparatebeltwidth() != null) {
			criteria.andSidesseparatebeltwidthGreaterThanOrEqualTo(advance.getMaxsidesseparatebeltwidth());
		}
//	    private BigDecimal minredlinewidth;
//	    private BigDecimal maxredlinewidth;
		if (advance.getMinredlinewidth() != null) {
			criteria.andRedlinewidthGreaterThanOrEqualTo(advance.getMinredlinewidth());
		}
		if (advance.getMinredlinewidth() != null) {
			criteria.andRedlinewidthLessThanOrEqualTo(advance.getMinredlinewidth());
		}
//	    private String start;
		if (advance.getStart() != null)
			criteria.andStartLike("%" + advance.getStart() + "%");
//	    private String end;
		if (advance.getEnd() != null)
			criteria.andEndLike("%" + advance.getEnd() + "%");
//	    private Integer roadlevelId;
		if (advance.getRoadlevelId() != null)
			criteria.andRoadlevelIdEqualTo(advance.getRoadlevelId());
		if (advance.getRoadBedId() != null)
			criteria.andRoadbedtypeIdEqualTo(advance.getRoadBedId());
//	    private String section;
		if (advance.getSection() != null)
			criteria.andSectionLike("%" + advance.getSection() + "%");
//	    private String creater;
		if (advance.getCreater() != null)
			criteria.andCreaterLike("%" + advance.getCreater() + "%");
//	    private String investigator;
		if (advance.getInvestigator() != null)
			criteria.andInvestigatorLike("%" + advance.getInvestigator() + "%");
//	    private String name;
		if (advance.getRoadname() != null)
			criteria.andRoadnameLike("%" + advance.getRoadname() + "%");
		
		PageHelper.startPage(page,13);
		List<Roadstate> list = roadstateMapper.selectByExample(example);
		PageInfo info = new PageInfo(list);
		
		
		return info;
	}

}
