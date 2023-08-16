package com.project;


import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STOCKSINFUND") 
public class StocksInFund {
	
	@EmbeddedId
	StockIdentifier identifier;
	double stockWeight;
	
	public StocksInFund() {
		super();
	}

	public StocksInFund(StockIdentifier identifier, double stockWeight) {
		super();
		this.identifier = identifier;
		this.stockWeight = stockWeight;
	}

	public StockIdentifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(StockIdentifier identifier) {
		this.identifier = identifier;
	}

	public double getStockWeight() {
		return stockWeight;
	}

	public void setStockWeight(double stockWeight) {
		this.stockWeight = stockWeight;
	}

	
	
	
	
	
}
