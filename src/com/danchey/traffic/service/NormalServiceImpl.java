package com.danchey.traffic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.danchey.traffic.controller.advance.NormalAdvanceAttr;
import com.danchey.traffic.mapper.NormalintersectionMapper;
import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.NormalintersectionExample;
import com.danchey.traffic.pojo.NormalintersectionExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class NormalServiceImpl implements NormalService {
	@Autowired
	private NormalintersectionMapper normalintersectionMapper;
	
	@Override
	public int insert(Normalintersection normalintersection) {
		// TODO Auto-generated method stub
		int insert = normalintersectionMapper.insert(normalintersection);
		return insert;
	}

	@Override
	public int updata(Normalintersection normalintersection) {
		// TODO Auto-generated method stub
		int line = normalintersectionMapper.updateByPrimaryKeySelective(normalintersection);
		return line;
	}

	@Override
	public int deleteByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		int line = normalintersectionMapper.deleteByPrimaryKey(id);
		return line;
	}

	@Override
	public PageInfo selectByAdvance(NormalAdvanceAttr advance) {
		// TODO Auto-generated method stub
		NormalintersectionExample example = new NormalintersectionExample();
		Criteria criteria = example.createCriteria();
		
		int page = advance.getPage()!=null?advance.getPage():1;
		

//		private Integer minId;
//		private Integer maxId;
		if(advance.getMinId()!=null) {
			criteria.andIdGreaterThanOrEqualTo(advance.getMinId());
		}
		if(advance.getMaxId()!=null) {
			criteria.andIdLessThanOrEqualTo(advance.getMaxId());
		}
//	    private Date minsurveytime;
//	    private Date maxsurveytime;
		if(advance.getMinsurveytime()!=null){
			criteria.andSurveytimeGreaterThanOrEqualTo(advance.getMinsurveytime());
		}
		if(advance.getMaxsurveytime()!=null){
			criteria.andSurveytimeLessThanOrEqualTo(advance.getMinsurveytime());
		}
//	    private Date mincreatetime;
//	    private Date mxacreatetime;
		if(advance.getMaxcreatetime()!=null) {
			criteria.andCreatetimeLessThanOrEqualTo(advance.getMaxcreatetime());
		}
		if(advance.getMincreatetime()!=null) {
			criteria.andCreatetimeGreaterThanOrEqualTo(advance.getMincreatetime());
		}
//	    private Date minupdatetime;
//	    private Date maxupdatetime;
		if(advance.getMinupdatetime()!=null){
			criteria.andUpdatetimeGreaterThanOrEqualTo(advance.getMinupdatetime());
		}
		if(advance.getMaxupdatetime()!=null){
			criteria.andUpdatetimeLessThanOrEqualTo(advance.getMaxupdatetime());
		}
//	    private String creater;
		if(advance.getCreater()!=null)
			criteria.andCreaterLike("%"+advance.getCreater()+"%");
//	    private String investigator;
		if(advance.getInvestigator()!=null)
			criteria.andInvestigatorLike("%"+advance.getInvestigator()+"%");
//	    private String name;
		if(advance.getName()!=null)
			criteria.andNameLike("%"+advance.getName()+"%");
//	    private Integer minIntonumber;
		if(advance.getMinIntonumber()!=null){
			criteria.andIntonumberGreaterThanOrEqualTo(advance.getMinIntonumber());
		}
		if(advance.getMaxIntonumber()!=null){
			criteria.andIntonumberLessThanOrEqualTo(advance.getMaxIntonumber());
		}
//	    private Integer maxIntowidth;
		if(advance.getMinIntowidth()!=null){
			criteria.andIntowidthGreaterThanOrEqualTo(advance.getMinIntowidth());
		}
		if(advance.getMaxIntowidth()!=null){
			criteria.andIntowidthLessThanOrEqualTo(advance.getMaxIntowidth());
		}
//	    private Integer areatypeId;
		if(advance.getAreatypeId()!=null)
			criteria.andAreatypeIdEqualTo(advance.getAreatypeId());
//	    private Integer controltypeId;
		if(advance.getControltypeId()!=null)
			criteria.andControltypeIdEqualTo(advance.getControltypeId());
		
		PageHelper.startPage(page, 13);
		List<Normalintersection> normalList = normalintersectionMapper.selectByExample(example);
		PageInfo info = new PageInfo(normalList);
		
		return info;
	}

	@Override
	public Normalintersection selectByPrimaryKey(int id) {
		// TODO Auto-generated method stub
		Normalintersection line = normalintersectionMapper.selectByPrimaryKey(id);
		return line;
	}

}
