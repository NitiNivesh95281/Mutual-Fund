package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvestorService {

	@Autowired
	InvestorRepository iRepository;


	public ArrayList<Investor> getAllInvestors(){

		return (ArrayList<Investor>) iRepository.findAll();
	}

	public String addInvestor(Investor newInvestor) {

		iRepository.save(newInvestor);
		return "Successfully inserted a new investor";
	}


}
