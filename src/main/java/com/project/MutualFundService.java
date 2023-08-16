package com.project;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MutualFundService {

	@Autowired
	MutualFundRepository mfRepository;
	@Autowired
	StocksInFundRepsoitory sifRepository;
	@Autowired
	StockRepository sRepository;
	
	
	public ArrayList<MutualFund> getAllMutualFunds(){
		return (ArrayList<MutualFund>) mfRepository.findAll();
	}
	
	public String addAMutualFund(MutualFund newMutualFund) {
		 mfRepository.save(newMutualFund);
		 
		 return "Mutual Fund has been successfully added!";
	}

	public ArrayList<StockInfo> getStockComposition(int mfid) {
		
		ArrayList<StocksInFund> allStocksWeight= new ArrayList<StocksInFund>();
		ArrayList<StockInfo> allStockInfo = new ArrayList<StockInfo>();
		
		Stock stock= null;
		
		for(StocksInFund sif : sifRepository.findAll()) {
			if(sif.getIdentifier().fundId == mfid) {
				allStocksWeight.add(sif);
				StockInfo stockInfo = new StockInfo();
				stockInfo.setStockId(sif.getIdentifier().stockId);
				stockInfo.setStockWeight(sif.getStockWeight());
				stock= sRepository.findOne(sif.getIdentifier().stockId);
				stockInfo.setStockName(stock.getStockTicker());
				stockInfo.setClosingPrice(stock.getClosingPrice());
				allStockInfo.add(stockInfo);
			}
		}
		System.out.println(allStockInfo);
//		return allStocksWeight;
		return allStockInfo;
	}
	
}
