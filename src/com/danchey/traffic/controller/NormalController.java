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

import com.danchey.traffic.controller.advance.NormalAdvanceAttr;
import com.danchey.traffic.mapper.NormalintersectionMapper;
import com.danchey.traffic.pojo.Normalintersection;
import com.danchey.traffic.pojo.RoadListAndPageInfo;
import com.danchey.traffic.pojo.RoadStateQueryVo;
import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.service.NormalService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value = "/intersection")
public class NormalController {
	@Autowired
	private NormalService normalService;
	
	@RequestMapping(value = "/normal.do")
	public String index(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "infrastructure/normal";
	}	
	
	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Normalintersection normalintersection, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		normalintersection.setUpdatetime(new Date());
		normalintersection.setCreatetime(new Date());
		normalintersection.setCreater("dancey");
		normalService.insert(normalintersection);
		return true;
	}	
	
	@RequestMapping(value = "/search.do")
	public @ResponseBody PageInfo search(NormalAdvanceAttr advance,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		PageInfo pageInfo = normalService.selectByAdvance(advance);
		return pageInfo;
	}	
	
	@RequestMapping(value = "/selectById.do")
	public @ResponseBody Normalintersection selectById(int id){
		Normalintersection normalintersection = normalService.selectByPrimaryKey(id);
		return normalintersection;
	}
	
	@RequestMapping(value = "/update.do")
	public @ResponseBody Normalintersection update(Normalintersection normalintersection){
		normalintersection.setUpdatetime(new Date());
		int line = normalService.updata(normalintersection);
		return normalintersection;
	}
	
	@RequestMapping(value = "/delete.do")
	public @ResponseBody Boolean deleteById(int id){
		int line = normalService.deleteByPrimaryKey(id);
		return true;
	}
	
	
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
}
