package com.danchey.traffic.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.danchey.traffic.pojo.RoadStateQueryVo;
import com.danchey.traffic.pojo.Alltype;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.service.AllTypeService;
import com.danchey.traffic.service.RoadStateQueryVoService;
import com.danchey.traffic.service.RoadStateService;

/**
 * TrafficController层
 * 
 * @author danchey
 *
 */
@Controller
@RequestMapping(value = "/infra")
public class InfraController {

	@Autowired
	private RoadStateService roadStateService;

	@Autowired
	private RoadStateQueryVoService roadStateQueryVoService;

	@RequestMapping(value = "/roadstate.do")
	public String infraRoad(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		/**
		 * 获取全部道路方法
		 * 
		 */
		
		List<RoadStateQueryVo> roadStateQueryVoList = roadStateQueryVoService.selectByPage(1,model);
		
		model.addAttribute("roadListVo", roadStateQueryVoList);
		return "infrastructure/roadstate";
	}

	
	
	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Roadstate roadstate, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {

		roadstate.setCoordinate("路径乱七八糟的东西");
		roadstate.setCreatetime(new Date());
		roadstate.setUpdatetime(new Date());
		roadstate.setCreater("danchey");

		int insert = roadStateService.insert(roadstate);
		
		return true;
		
	}
	
	@RequestMapping(value = "/selectById.do")
	public @ResponseBody RoadStateQueryVo selectById(int id){
		RoadStateQueryVo road = roadStateQueryVoService.selectByRoadId(id);
		return road;
	}
	
	@RequestMapping(value = "/update.do")
	public @ResponseBody RoadStateQueryVo update(Roadstate roadstate) {		
		int updata = roadStateService.updata(roadstate);
		RoadStateQueryVo roadStateQueryVo = roadStateQueryVoService.selectByRoadId(roadstate.getId());
		if(updata==0) {
			return null;
		}
		return roadStateQueryVo;
		
	}

	@RequestMapping(value = "/delete.do")
	public @ResponseBody Boolean delete(int id) {		
		int line = roadStateService.deleteByPrimaryKey(id);
		return true;
	}
	

	@RequestMapping("/index.do")
	public String index(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {

		return "index.jsp";
	}

	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
}
