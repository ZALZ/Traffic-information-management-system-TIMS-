package com.danchey.traffic.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class CheckLogin implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		HttpSession session = request.getSession();
		//判断session的状态是否登陆
		Object username = session.getAttribute("username");
		if (username != null) {
			// 如果不为空则放行
			return true;
		} else {
			// 如果为空则跳转到登录页面
			response.sendRedirect(request.getContextPath() + "/user/toLogin.do");
			return false;
		}
	}
}
