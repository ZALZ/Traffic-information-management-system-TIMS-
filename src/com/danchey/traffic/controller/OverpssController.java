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
import com.danchey.traffic.pojo.Overpass;
import com.danchey.traffic.service.OverpassService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value = "/overpass")
public class OverpssController {

	@Autowired
	private OverpassService overpassService;

	@RequestMapping(value = "/overpass.do")
	public String index(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "infrastructure/overpass";
	}

	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Overpass overpass, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		overpass.setUpdatetime(new Date());
		overpass.setCreatetime(new Date());
		overpass.setCreater("dancey");
		int insert = overpassService.insert(overpass);
		if (insert > 0)
			return true;
		else
			return false;
	}
	
	@RequestMapping(value = "/search.do")
	public @ResponseBody PageInfo search(OverpassAdvance advance,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		PageInfo pageInfo = overpassService.selectByAdvance(advance);
		return pageInfo;
	}	
	
	@RequestMapping(value = "/selectById.do")
	public @ResponseBody Overpass selectById(int id){
		Overpass overpass = overpassService.selectByPrimaryKey(id);
		return overpass;
	}
	
	@RequestMapping(value = "/delete.do")
	public @ResponseBody Boolean deleteById(int id){
		int line = overpassService.deleteByPrimaryKey(id);
		return true;
	}
	
	@RequestMapping(value = "/update.do")
	public @ResponseBody Overpass updateById(Overpass overpass){
		int line = overpassService.updata(overpass);
		Overpass overpass2 = overpassService.selectByPrimaryKey(overpass.getId());
		return overpass2;
	}
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}

}
