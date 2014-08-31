package com.baron.login.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baron.login.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	private LoginService loginService;
	
	@RequestMapping("/loginForm.baron")
	public String loginForm() {
		
		return "login/loginForm";
	}
	
	@RequestMapping("/login.baron")
	public String login(String id, String password) {
		
		System.out.println(id + " : " + password);
		
		boolean result = loginService.login(id, password);
		
		if (result) {
			return "login/loginOk";
		} else {
			return "login/loginFail";
		}
	}
}
