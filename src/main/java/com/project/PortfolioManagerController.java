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
public class PortfolioManagerController {

	@Autowired
	PortfolioManagerService pm;
	
	@RequestMapping(value="/portfoliomanagers", method=RequestMethod.GET)
	public ArrayList<PortfolioManager> getAllPortfolioManagers(){
		
		System.out.println("inside the controller");
		return pm.getAllPortfolioManagers();
	}
	
	@RequestMapping(value="/portfoliomanagers/add", method=RequestMethod.POST)
	public String addPortfolioManager(@RequestBody PortfolioManager newPortfolioManager ){
	
		System.out.println("inside the controller");
		return pm.addPortfolioManager(newPortfolioManager); 
	}
	
	
	

}
