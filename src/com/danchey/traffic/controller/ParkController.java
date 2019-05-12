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

import com.danchey.traffic.controller.advance.OverpassAdvance;
import com.danchey.traffic.controller.advance.ParkAdvance;
import com.danchey.traffic.pojo.Overpass;
import com.danchey.traffic.pojo.Park;
import com.danchey.traffic.service.ParkService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value = "/park")
public class ParkController {
	
	@Autowired
	private ParkService parkSrivice;
	
	@RequestMapping(value = "/park.do")
	public String index(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "infrastructure/park";
	}

	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Park park, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		park.setUpdatetime(new Date());
		park.setCreatetime(new Date());
		park.setCreater("dancey");
		int insert = parkSrivice.insert(park);
		if (insert > 0)
			return true;
		else
			return false;
	}
	
	@RequestMapping(value = "/search.do")
	public @ResponseBody PageInfo search(ParkAdvance advance,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		PageInfo pageInfo = parkSrivice.selectByAdvance(advance);
		return pageInfo;
	}	
	
	@RequestMapping(value = "/selectById.do")
	public @ResponseBody Park selectById(int id){
		Park park = parkSrivice.selectByPrimaryKey(id);
		return park;
	}
	
	@RequestMapping(value = "/delete.do")
	public @ResponseBody Boolean deleteById(int id){
		int line = parkSrivice.deleteByPrimaryKey(id);
		return true;
	}
	
	@RequestMapping(value = "/update.do")
	public @ResponseBody Park updateById(Park park){
		int line = parkSrivice.updata(park);
		Park park2 = parkSrivice.selectByPrimaryKey(park.getId());
		return park2;
	}
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	

}
