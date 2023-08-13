package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Service
public class StockService {

	@Autowired
	StockRepository sRepository;

	public ArrayList<Stock> getAllStocks(){

		return (ArrayList<Stock>) sRepository.findAll();
	}

	@RequestMapping(value="/stocks/add", method=RequestMethod.POST)
	public String addStocks(@RequestBody Stock newStock ){


		 sRepository.save(newStock);
		 
		 return "Successfully added a new stock!";
	}

}
