package com.project;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock {

	@Id
	int stockId;
	String stockTicker;
	Date dateOfRecord;
	double openingPrice, lowPrice, closingPrice, highPrice;
	
	public Stock() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Stock(int stockID, String stockTicker, Date dateOfRecord, double openingPrice, double lowPrice,
			double closingPrice, double highPrice) {
		super();
		this.stockId = stockID;
		this.stockTicker = stockTicker;
		this.dateOfRecord = dateOfRecord;
		this.openingPrice = openingPrice;
		this.lowPrice = lowPrice;
		this.closingPrice = closingPrice;
		this.highPrice = highPrice;
	}



	public int getStockID() {
		return stockId;
	}

	public void setStockID(int stockID) {
		this.stockId = stockID;
	}

	public String getStockTicker() {
		return stockTicker;
	}

	public void setStockTicker(String stockTicker) {
		this.stockTicker = stockTicker;
	}

	public Date getDateOfRecord() {
		return dateOfRecord;
	}

	public void setDateOfRecord(Date dateOfRecord) {
		this.dateOfRecord = dateOfRecord;
	}

	public double getOpeningPrice() {
		return openingPrice;
	}

	public void setOpeningPrice(double openingPrice) {
		this.openingPrice = openingPrice;
	}

	public double getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(double lowPrice) {
		this.lowPrice = lowPrice;
	}

	public double getClosingPrice() {
		return closingPrice;
	}

	public void setClosingPrice(double closingPrice) {
		this.closingPrice = closingPrice;
	}

	public double getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(double highPrice) {
		this.highPrice = highPrice;
	}

	
	
	
}
