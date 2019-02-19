package com.danchey.traffic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * TrafficController²ã
 * @author danchey
 *
 */
@Controller
public class TrafficController {
	
	@RequestMapping("/itemlist.action")
	public ModelAndView traffic() {
		
		ModelAndView mac = new ModelAndView();
		mac.setViewName("/WEB-INF/traffic.jsp");
		return mac;
	}

}
