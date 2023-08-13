package com.project;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MutualFundController {

	
	
	@RequestMapping(value="/landing", method=RequestMethod.GET)
	public String m1() {
		return "Hello Mutual Fund";
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String m2() {
		return "Login Mutual Fund";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String m3() {
		return "Register Mutual Fund";
	}
}
