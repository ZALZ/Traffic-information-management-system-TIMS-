package com.danchey.traffic.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.MessagingException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.danchey.traffic.pojo.Roadstate;
import com.danchey.traffic.service.RoadStateServiceImpl;

/**
 * TrafficController²ã
 * @author danchey
 *
 */
@Controller
public class TrafficController {
	
	@Autowired
	private RoadStateServiceImpl roadStateServiceImpl;
	
	
	@RequestMapping(value="/roadstate.do")
	public String state(Model model,HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse) {
		
		List<Roadstate> roadList = roadStateServiceImpl.selectRoadList();
		model.addAttribute("roadList", roadList);
		
		return "infrastructure/roadstate";
		
	}
	@RequestMapping("/index.do")
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
	
	

}
