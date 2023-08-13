package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StockController {

	@Autowired
	StockService ss;
	
	
	@RequestMapping(value="/stocks", method=RequestMethod.GET)
	public ArrayList<Stock> getAllStocks(){
		
		return ss.getAllStocks();
	}
	
	@RequestMapping(value="/stocks/add", method=RequestMethod.POST)
	public String addStocks(@RequestBody Stock newStock ){
	
		return ss.addStocks(newStock); 
	}
	
	
}
