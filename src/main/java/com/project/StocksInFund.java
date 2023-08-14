package com.project;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STOCKSINFUND") 
public class StocksInFund {
	
	@Id
	int fundId;
	int stockId;
	double stockWeight;
	
	public StocksInFund() {
		super();
	}
	
	public StocksInFund(int fundID, int stockID, double stockWeight) {
		super();
		this.fundId = fundID;
		this.stockId = stockID;
		this.stockWeight = stockWeight;
	}

	public int getFundID() {
		return fundId;
	}

	public void setFundID(int fundID) {
		this.fundId = fundID;
	}

	public int getStockID() {
		return stockId;
	}

	public void setStockID(int stockID) {
		this.stockId = stockID;
	}

	public double getStockWeight() {
		return stockWeight;
	}

	public void setStockWeight(double stockWeight) {
		this.stockWeight = stockWeight;
	}
	
	
	
	
	
}
