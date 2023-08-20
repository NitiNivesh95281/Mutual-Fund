package com.project.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.MutualFund;
import com.project.StockIdentifier;
import com.project.StockInfo;
import com.project.StocksInFund;
import com.project.service.MutualFundService;
import com.project.service.StocksInFundService;

@RestController
@CrossOrigin(origins = "*")
public class MutualFundController {

	@Autowired
	MutualFundService mfs;
	
	@Autowired
    private StocksInFundService sif;
	
	@RequestMapping(value="/mutualfunds", method=RequestMethod.GET)
	public ArrayList<MutualFund> getAllMutualFunds(){
		System.out.println(mfs.getAllMutualFunds());
		return mfs.getAllMutualFunds();
	}
	
	
	@RequestMapping(value="/mutualfund/add", method=RequestMethod.POST)
	public <T> ResponseEntity<MutualFund> createMutualFund(@RequestBody Map<String, T> request) {
		String fundName = (String) request.get("fundName");
		
		double expenseRatio = 0.0;
		if (request.get("expenseRatio") instanceof Double) {
		    expenseRatio = (Double) request.get("expenseRatio");
		} else if (request.get("expenseRatio") instanceof Integer) {
		    expenseRatio = ((Integer) request.get("expenseRatio")).doubleValue();
		}

		double currentNAV = 0.0;
		if (request.get("currentNAV") instanceof Double) {
		    currentNAV = (Double) request.get("currentNAV");
		} else if (request.get("currentNAV") instanceof Integer) {
		    currentNAV = ((Integer) request.get("currentNAV")).doubleValue();
		}

		double exitLoad = 0.0;
		if (request.get("exitLoad") instanceof Double) {
		    exitLoad = (Double) request.get("exitLoad");
		} else if (request.get("exitLoad") instanceof Integer) {
		    exitLoad = ((Integer) request.get("exitLoad")).doubleValue();
		}
		
		MutualFund mutualFundDetails = new MutualFund();
		mutualFundDetails.setFundName(fundName);
		mutualFundDetails.setCurrentNAV(currentNAV);
		mutualFundDetails.setExitLoad(exitLoad);
		mutualFundDetails.setExpenseRatio(expenseRatio);
		
		@SuppressWarnings("unchecked")
		List<Map<String, Object>> list = (List<Map<String, Object>>) request.get("selectedStocks");

		
		System.out.println(fundName);
		System.out.println(expenseRatio);
		System.out.println(currentNAV);
		System.out.println(exitLoad);
		System.out.println(list);
		
        MutualFund createdMutualFund = mfs.createMutualFund(mutualFundDetails);
        System.out.println(createdMutualFund);
        
        
        for (Map<String, Object> stockMap : list) {
            int stockId = Integer.parseInt(stockMap.get("stockID").toString());
            double weightage = ((Number) stockMap.get("weightage")).doubleValue();
                
                
            System.out.println(stockId);
            System.out.println(weightage);
            System.out.println(createdMutualFund.getFundId());

            // Create the StockIdentifier for composite key
            StockIdentifier stockIdentifier = new StockIdentifier();
            stockIdentifier.setFundId(createdMutualFund.getFundId()); // Assuming you have a method to get FundId from createdMutualFund
            stockIdentifier.setStockId(stockId);

            // Create a StocksInFund instance and set its properties
            StocksInFund stocksInFund = new StocksInFund();
            stocksInFund.setIdentifier(stockIdentifier);
            stocksInFund.setStockWeight(weightage);
            System.out.println(stocksInFund);
            
            sif.addStocksWeight(stocksInFund);
        }
        return ResponseEntity.ok(createdMutualFund);
    }
	
	@RequestMapping(value="/mutualfunds/id/{mfid}", method=RequestMethod.GET)
	public MutualFund getMutualFundInfo(@PathVariable int mfid) {
		return mfs.getMutualFundInfo(mfid);
	}
	
	
	@RequestMapping(value="/mutualfund/getstockweights/{mfid}", method=RequestMethod.GET)
	public ArrayList<StockInfo> getStockComposition(@PathVariable int mfid) {
		
			return mfs.getStockComposition(mfid);
	}
	

}
