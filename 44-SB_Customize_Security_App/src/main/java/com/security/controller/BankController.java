package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {
	
	@GetMapping("/home")
	public String home() {
		String str="Welcome to Axix Bank....!!";
		return str;
	}
	
	@GetMapping("/balance")
	public String balance() {
		String str="Your balance amount is 2,50,000";
		return str;
	}

}
