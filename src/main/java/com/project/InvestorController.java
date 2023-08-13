package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InvestorController {

	@Autowired
	InvestorService is;
	
	

	@RequestMapping(value="/investors", method=RequestMethod.GET)
	public ArrayList<Investor> getAllInvestors(){
		
		return is.getAllInvestors();
	}
	
	@RequestMapping(value="/investors/add", method=RequestMethod.POST)
	public String addPortfolioManager(@RequestBody Investor newInvestor ){
	
		
		return is.addInvestor(newInvestor); 
	}
	
}
