package com.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Investment;
import com.project.repository.InvestmentRepository;

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

public Investment getInvestmentDetails(int investmentId) {
		
//		for(Investment i : ivRepository.findAll()) {
//			if(i.getInvestmentId()==investmentId)
//				return i;
//		}
//		
//		return null;
		
		return ivRepository.findInvestmentByInvestmentId(investmentId);
	}
	
	public ArrayList<Investment> getInvestmentsById(int investorid) {

		ArrayList<Investment> allInvestmentsforInvestor = new ArrayList<Investment>();
		
		 for(Investment investment : ivRepository.findAll()) {
			 if(investment.getInvestorId()==investorid) {
				 allInvestmentsforInvestor.add(investment);
			 }
		 }
		 System.out.println(allInvestmentsforInvestor);
		 return allInvestmentsforInvestor;

		
	}
	
}
