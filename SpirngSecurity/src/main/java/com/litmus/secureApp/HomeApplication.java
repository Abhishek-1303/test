package com.litmus.secureApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeApplication {

	@GetMapping("/")
	public String home() {
		return "index.jsp";
	}
	
	
//	@GetMapping("/login")
//	public String loginPAge() {
//		return "login.jsp";
//	}
}
