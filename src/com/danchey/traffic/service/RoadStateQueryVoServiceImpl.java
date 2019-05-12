package com.danchey.traffic.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.danchey.traffic.controller.advance.RoadAdvance;
import com.danchey.traffic.mapper.AlltypeMapper;
import com.danchey.traffic.mapper.RoadstateMapper;
import com.danchey.traffic.pojo.Alltype;
import com.danchey.traffic.pojo.RoadListAndPageInfo;
import com.danchey.traffic.pojo.RoadStateQueryVo;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.pojo.RoadstateExample;
import com.danchey.traffic.pojo.RoadstateExample.Criteria;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class RoadStateQueryVoServiceImpl implements RoadStateQueryVoService {


	@Autowired
	private RoadstateMapper roadstateMapper;
	
	@Autowired
	private AlltypeMapper alltypeMapper;
	
	
	@Override
	public List<RoadStateQueryVo> selectAll() {
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
		Integer p = (page==null || page<0)?1:page;
		
		List<Roadstate> roadList =null;
		PageHelper.startPage(p,13);
		roadList = roadstateMapper.selectByExample(null);

		PageInfo info = new PageInfo(roadList);
		roadList = (List<Roadstate>) roadList;

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
		
		model.addAttribute("total", info.getTotal());
		model.addAttribute("totalPage",info.getPages());
		model.addAttribute("currentPage",info.getPageNum());
		model.addAttribute("pageSize",info.getPageSize());
		
		return roadStateQueryVoList;
	}

	@Override
	public RoadListAndPageInfo selectAdvance(RoadAdvance advance) {
		
		RoadstateExample example = new RoadstateExample();
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
//	    private BigDecimal minlength;
//	    private BigDecimal maxlength;
		if(advance.getMinlength()!=null){
			criteria.andLengthGreaterThanOrEqualTo(advance.getMinlength());
		}
		if(advance.getMaxlength()!=null){
			criteria.andLengthLessThanOrEqualTo(advance.getMaxlength());
		}
//	    private BigDecimal minincline;
//	    private BigDecimal maxincline;
		if(advance.getMinincline()!=null){
			criteria.andInclineGreaterThanOrEqualTo(advance.getMinlength());
		}
		if(advance.getMaxincline()!=null){
			criteria.andInclineLessThanOrEqualTo(advance.getMaxlength());
		}
//	    private BigDecimal minmotorwaywidth;
//	    private BigDecimal maxmotorwaywidth;
		if(advance.getMinmotorwaywidth()!=null){
			criteria.andMotorwaywidthGreaterThanOrEqualTo(advance.getMinmotorwaywidth());
		}
		if(advance.getMaxmotorwaywidth()!=null){
			criteria.andMotorwaywidthLessThanOrEqualTo(advance.getMaxmotorwaywidth());
		}
//	    private BigDecimal minsuperwaywidth;
//	    private BigDecimal maxsuperwaywidth;
		if(advance.getMinsuperwaywidth()!=null){
			criteria.andSuperwaywidthGreaterThanOrEqualTo(advance.getMinsuperwaywidth());
		}
		if(advance.getMaxsuperwaywidth()!=null){
			criteria.andSuperwaywidthLessThanOrEqualTo(advance.getMaxsuperwaywidth());
		}
//	    private BigDecimal minpavementwidth;
//	    private BigDecimal maxpavementwidth;
		if(advance.getMinpavementwidth()!=null){
			criteria.andPavementwidthGreaterThanOrEqualTo(advance.getMinpavementwidth());
		}
		if(advance.getMaxpavementwidth()!=null){
			criteria.andPavementwidthLessThanOrEqualTo(advance.getMaxpavementwidth());
		}
//	    private BigDecimal minmedianwidth;
//	    private BigDecimal maxmedianwidth;
		if(advance.getMinmedianwidth()!=null){
			criteria.andMedianwidthGreaterThanOrEqualTo(advance.getMinmedianwidth());
		}
		if(advance.getMinmedianwidth()!=null){
			criteria.andMedianwidthLessThanOrEqualTo(advance.getMinmedianwidth());
		}
//	    private BigDecimal minsidesseparatebeltwidth;
//	    private BigDecimal maxsidesseparatebeltwidth;
		if(advance.getMinsidesseparatebeltwidth()!=null){
			criteria.andSidesseparatebeltwidthGreaterThanOrEqualTo(advance.getMinsidesseparatebeltwidth());
		}
		if(advance.getMaxsidesseparatebeltwidth()!=null){
			criteria.andSidesseparatebeltwidthLessThanOrEqualTo(advance.getMaxsidesseparatebeltwidth());
		}
//	    private BigDecimal minredlinewidth;
//	    private BigDecimal maxredlinewidth;
		if(advance.getMinredlinewidth()!=null){
			criteria.andRedlinewidthGreaterThanOrEqualTo(advance.getMinredlinewidth());
		}
		if(advance.getMaxredlinewidth()!=null){
			criteria.andRedlinewidthLessThanOrEqualTo(advance.getMaxredlinewidth());
		}
//	    private String start;
		if(advance.getStart()!=null)
			criteria.andStartLike("%"+advance.getStart()+"%");
//	    private String end;
		if(advance.getEnd()!=null)
			criteria.andEndLike("%"+advance.getEnd()+"%");
//	    private Integer roadlevelId;
		if(advance.getRoadlevelId()!=null)
			criteria.andRoadlevelIdEqualTo(advance.getRoadlevelId());
//	    private String creater;
		if(advance.getCreater()!=null)
			criteria.andCreaterLike("%"+advance.getCreater()+"%");
//	    private String investigator;
		if(advance.getInvestigator()!=null)
			criteria.andInvestigatorLike("%"+advance.getInvestigator()+"%");
//	    private String roadname;
		if(advance.getRoadname()!=null)
			criteria.andRoadnameLike("%"+advance.getRoadname()+"%");		
//	    private String section;
		if(advance.getSection()!=null)
			criteria.andRoadnameLike("%"+advance.getSection()+"%");
		
		PageHelper.startPage(page,13);
		List<Roadstate> roadlist = roadstateMapper.selectByExample(example);
		PageInfo info = new PageInfo(roadlist);
		RoadListAndPageInfo rari = new RoadListAndPageInfo(roadlist, info) ;
		
		return rari;
	}

}












