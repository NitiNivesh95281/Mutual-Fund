package com.project.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Investor;
import com.project.repository.InvestorRepository;

@Service
public class InvestorService {

	@Autowired
	InvestorRepository iRepository;


	public boolean authenticate(String email, String password) {
		Investor investor = iRepository.findByEmail(email);
        
        if (investor != null) {
            // Validate password (e.g., hash and compare)
            return validatePassword(password, investor.getPassword());
        }
        return false;
    }

    	private boolean validatePassword(String inputPassword, String storedPasswordHash) {
        // Implement password validation logic here (hashing, comparison, etc.)
        return inputPassword.equals(storedPasswordHash);
    }
    	
	public ArrayList<Investor> getAllInvestors(){

		return (ArrayList<Investor>) iRepository.findAll();
	}

	public String addInvestor(Investor newInvestor) {

		iRepository.save(newInvestor);
		return "Successfully inserted a new investor";
	}
	
	
	public boolean emailExists(String email) {
        return iRepository.findByEmail(email) != null;
    }

	
	public Investor getInvestorInfo(int investorid) {
		return iRepository.findOne(investorid);
	}


}
