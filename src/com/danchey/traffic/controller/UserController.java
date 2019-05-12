package com.danchey.traffic.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.danchey.traffic.pojo.TrafficUser;
import com.danchey.traffic.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	/**
	 * 跳转到登录页面
	 * 
	 * @return
	 */
	@RequestMapping("/toLogin.do")
	public String toLogin() {
		return "user/login";
	}

	@RequestMapping("/login.do")
	public String login(TrafficUser user, HttpSession session) {
		//判断username,password,并想session中保存
		if(user.getUsername()!=null && user.getPassword()!=null) {
			if(userService.checkUser(user)) {
				session.setAttribute("username", user.getUsername());
				return "redirect:/index.do";
			}
		}
		return "redirect:/user/toLogin.do";
	}
	
	@RequestMapping("/regist.do")
	public String regist(TrafficUser user,HttpSession session) {
		Boolean regist = userService.regist(user);
		if(regist) {
			return "redirect:/index.do";
		}else {
			return "redirect:/user/toLogin.do";
		}
	}

}
