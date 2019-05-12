package com.danchey.traffic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.OverpassAdvance;
import com.danchey.traffic.mapper.OverpassMapper;
import com.danchey.traffic.pojo.Overpass;
import com.danchey.traffic.pojo.OverpassExample;
import com.danchey.traffic.pojo.OverpassExample.Criteria;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class OverpassServiceImpl implements OverpassService {
	@Autowired
	private OverpassMapper overpassMapper;

	@Override
	public int insert(Overpass overpass) {
		// TODO Auto-generated method stub
		overpassMapper.insert(overpass);
		return 0;
	}

	@Override
	public int updata(Overpass overpass) {
		// TODO Auto-generated method stub
		int line = overpassMapper.updateByPrimaryKeySelective(overpass);
		return line;
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		int line = overpassMapper.deleteByPrimaryKey(id);
		return line;
	}

	@Override
	public Overpass selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		Overpass overpass = overpassMapper.selectByPrimaryKey(id);
		return overpass;
	}

	@Override
	public PageInfo selectByAdvance(OverpassAdvance advance) {
		// TODO Auto-generated method stub
		OverpassExample example = new OverpassExample();
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
//	    private BigDecimal radius;
		if (advance.getMinradius() != null) {
			criteria.andRadiusGreaterThanOrEqualTo(advance.getMinradius());
		}
		if (advance.getMaxradius() != null) {
			criteria.andRadiusLessThanOrEqualTo(advance.getMaxradius());
		}
//	    private BigDecimal longitudinalgrade;
		if (advance.getMinlongitudinalgrade() != null) {
			criteria.andLongitudinalgradeGreaterThanOrEqualTo(advance.getMinlongitudinalgrade());
		}
		if (advance.getMaxlongitudinalgrade() != null) {
			criteria.andLongitudinalgradeLessThanOrEqualTo(advance.getMaxlongitudinalgrade());
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
//	    private Boolean hasstation;
		if (advance.getHasadd() != null)
			criteria.andHasaddEqualTo(advance.getHasadd());
//		private Boolean hasadd;
		if (advance.getHasstation() != null)
			criteria.andHasstationEqualTo(advance.getHasstation());
//	    private Integer ramptypeId;
		if (advance.getRamptypeId() != null)
			criteria.andRamptypeIdEqualTo(advance.getRamptypeId());
//	    private String coordinate;
		if (advance.getDisturbance() != null)
			criteria.andDisturbanceLike("%"+advance.getDisturbance()+"%");
		
		PageHelper.startPage(page, 13);
		List<Overpass> list = overpassMapper.selectByExample(example);
		PageInfo info= new PageInfo(list);
		
		return info;
	}

}
