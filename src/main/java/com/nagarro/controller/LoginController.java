package com.nagarro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nagarro.service.UserService;

@Controller
public class LoginController {
	@Autowired
	private UserService userService;

	@RequestMapping("/Login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		if (!userService.validateUser(userName, password)) {
			mv.setViewName("index");
		} else {
			mv.setViewName("display");
		}
		return mv;
	}

}
