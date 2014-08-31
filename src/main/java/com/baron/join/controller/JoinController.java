package com.baron.join.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.baron.join.service.JoinService;

@Controller
public class JoinController {
	
	@Autowired
	private JoinService joinService;

	@RequestMapping("/joinForm.baron")
	public String joinForm() {
		
		return "join/joinForm";
	}
	
	@RequestMapping("/join.baron")
	public String join(String id, String password) {

		joinService.join(id, password);
		
		return "redirect:/loginForm.baron";
	}
}
