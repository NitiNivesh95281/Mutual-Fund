package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestmentService {

	@Autowired
	InvestmentRepository ivRepository;
	
	public ArrayList<Investment> getAllInvestments(){
		return (ArrayList<Investment>) ivRepository.findAll();
	}
	
	public String addAInvestment(Investment newInvestment) {
		ivRepository.save(newInvestment);
		return "Successfully added a new investment!";
	}
	
}
