package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioManagerService {

	@Autowired
	PortfolioManagerRepository pmRepository;
	
	public String addPortfolioManager(PortfolioManager pm) {
		
		pmRepository.save(pm);
		return "Successfully inserted";
	}
	
	public ArrayList<PortfolioManager> getAllPortfolioManagers(){
		
		System.out.println("inside the service");
		return (ArrayList<PortfolioManager>) pmRepository.findAll();
	}
	
}
