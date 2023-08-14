package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class InvestmentController {

	@Autowired
	InvestmentService is;
	
	
	@RequestMapping(value="/investments", method=RequestMethod.GET)
	public ArrayList<Investment> getAllInvestments(){
		
		return is.getAllInvestments();
	}
	
	@RequestMapping(value="/investments/add", method=RequestMethod.POST)
	public String addInvestments(@RequestBody Investment newInvestment) {
		
		return is.addAInvestment(newInvestment);
	}
	
	
	
}
