package com.danchey.traffic.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class CheckLogin implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		HttpSession session = request.getSession();
		//�ж�session��״̬�Ƿ��½
		Object username = session.getAttribute("username");
		if (username != null) {
			// �����Ϊ�������
			return true;
		} else {
			// ���Ϊ������ת����¼ҳ��
			response.sendRedirect(request.getContextPath() + "/user/toLogin.do");
			return false;
		}
	}
}
