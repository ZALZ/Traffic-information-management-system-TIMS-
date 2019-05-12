package com.danchey.traffic.controller;

import java.text.SimpleDateFormat;
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

import com.danchey.traffic.controller.advance.FlowAdvance;
import com.danchey.traffic.controller.advance.ParkAdvance;
import com.danchey.traffic.pojo.Park;
import com.danchey.traffic.pojo.Pedestrianflow;
import com.danchey.traffic.service.PeopleService;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping(value = "/people")
public class PeopleController {
	@Autowired
	private PeopleService peopleService;

	@RequestMapping(value = "/people.do")
	public String index(Model model, HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		return "people/people";
	}

	@RequestMapping(value = "/insert.do")
	public @ResponseBody Boolean insert(Pedestrianflow pedflow, HttpServletRequest httpServletRequest,
			HttpServletResponse httpServletResponse) {
		pedflow.setUpdatetime(new Date());
		pedflow.setCreatetime(new Date());
		pedflow.setCreater("dancey");
		int insert = peopleService.insert(pedflow);
		if (insert > 0)
			return true;
		else
			return false;
	}
	
	@RequestMapping(value = "/search.do")
	public @ResponseBody PageInfo search(FlowAdvance advance,HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) {
		PageInfo pageInfo = peopleService.selectByAdvance(advance);
		return pageInfo;
	}	
	
	@RequestMapping(value = "/selectById.do")
	public @ResponseBody Pedestrianflow selectById(int id){
		Pedestrianflow pedestrianflow = peopleService.selectByPrimaryKey(id);
		return pedestrianflow;
	}
	
	@RequestMapping(value = "/delete.do")
	public @ResponseBody Boolean deleteById(int id){
		int line = peopleService.deleteByPrimaryKey(id);
		return true;
	}
	
	@RequestMapping(value = "/update.do")
	public @ResponseBody Pedestrianflow updateById(Pedestrianflow pedestrianflow){
		int line = peopleService.updata(pedestrianflow);
		Pedestrianflow pedestrianflow2 = peopleService.selectByPrimaryKey(pedestrianflow.getId());
		return pedestrianflow2;
	}

	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	    binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	
}
