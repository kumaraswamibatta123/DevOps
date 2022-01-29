package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping("/")
	public String hello() {
		System.out.println("Hello DevOps");
		return "Welcome DevOps 123";
	}

}
