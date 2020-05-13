package com.cognizant.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	@GetMapping("/")
	public String defaultMessage() {
		return "Hello from Azure from default!!";
	}
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello from Azure!!";
	}
}
