package me.Lja.config.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "welcome";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
}
