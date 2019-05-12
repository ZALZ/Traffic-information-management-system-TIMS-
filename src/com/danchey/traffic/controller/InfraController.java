package com.danchey.traffic.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

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

import com.danchey.traffic.controller.advance.RoadAdvance;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.service.RoadStateService;
import com.github.pagehelper.PageInfo;

/**
 * TrafficController²ã
 * 
 * @author danchey
 *
 */
@Controller
@RequestMapping(value = "/infra")
public class InfraController {

	@Autowired
	private RoadStateService roadStateService;


	@RequestMapping(value = "/roadstate.do")
	public String infraRoad(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "infrastructure/roadstate";
	}	
	
	@RequestMapping(value = "/search.do")
	public @ResponseBody PageInfo search(RoadAdvance advance,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		
		PageInfo info = roadStateService.selectByAdvance(advance);
		return info;
	}	
	

	
	
	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Roadstate roadstate, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {

		roadstate.setCreatetime(new Date());
		roadstate.setUpdatetime(new Date());
		roadstate.setCreater("danchey");

		int insert = roadStateService.insert(roadstate);
		
		return true;
		
	}
	
	@RequestMapping(value = "/selectById.do")
	public @ResponseBody Roadstate selectById(int id){
		Roadstate roadstate = roadStateService.selectByPrimaryKey(id);
		return roadstate;
	}
	
	@RequestMapping(value = "/update.do")
	public @ResponseBody Roadstate update(Roadstate roadstate) {		
		int updata = roadStateService.updata(roadstate);
		Roadstate roadstate2 = roadStateService.selectByPrimaryKey(roadstate.getId());
		if(updata==0) {
			return null;
		}
		return roadstate2;
		
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
