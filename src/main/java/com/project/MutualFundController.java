package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:5501")
public class MutualFundController {

	@Autowired
	MutualFundService mfs;
	
	@RequestMapping(value="/mutualfunds", method=RequestMethod.GET)
	public ArrayList<MutualFund> getAllMutualFunds(){
		return mfs.getAllMutualFunds();
	}
	
	@RequestMapping(value="/mutualfund/add", method=RequestMethod.POST)
	public String addAMutualFund(@RequestBody MutualFund newMutualFund) {
		return mfs.addAMutualFund(newMutualFund);
	}
	
	@RequestMapping(value="/mutualfund/getstockweights/{mfid}", method=RequestMethod.GET)
	public ArrayList<StockInfo> getStockComposition(@PathVariable int mfid) {
		
			return mfs.getStockComposition(mfid);
	}
	
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
