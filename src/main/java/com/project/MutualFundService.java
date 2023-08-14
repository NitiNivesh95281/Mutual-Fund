package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MutualFundService {

	@Autowired
	MutualFundRepository mfRepository;
	
	public ArrayList<MutualFund> getAllMutualFunds(){
		return (ArrayList<MutualFund>) mfRepository.findAll();
	}
	
	public String addAMutualFund(MutualFund newMutualFund) {
		 mfRepository.save(newMutualFund);
		 
		 return "Mutual Fund has been successfully added!";
	}
	
}
