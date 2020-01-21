package com.example.sampleweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	
	@RequestMapping("/login")
	public String getLoginPage() {
		System.out.println("HI");
		return "login";
	}

}
