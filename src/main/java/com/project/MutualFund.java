package com.project;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MUTUALFUND")
public class MutualFund {

	@Id
	int fundId ;
	String fundName;
	double assetsUnderManagement, currentNAV, expenseRatio, exitLoad;
	int managerId;
	Date inceptionDate;
	
	public MutualFund() {
		super();
	}

	public MutualFund(int fundId, String fundName, double assetsUnderManagement, double currentNAV, double expenseRatio,
			double exitLoad, int managerId, Date inceptionDate) {
		super();
		this.fundId = fundId;
		this.fundName = fundName;
		this.assetsUnderManagement = assetsUnderManagement;
		this.currentNAV = currentNAV;
		this.expenseRatio = expenseRatio;
		this.exitLoad = exitLoad;
		this.managerId = managerId;
		this.inceptionDate = inceptionDate;
	}

	public int getFundId() {
		return fundId;
	}

	public void setFundId(int fundId) {
		this.fundId = fundId;
	}

	public String getFundName() {
		return fundName;
	}

	public void setFundName(String fundName) {
		this.fundName = fundName;
	}

	public double getAssetsUnderManagement() {
		return assetsUnderManagement;
	}

	public void setAssetsUnderManagement(double assetsUnderManagement) {
		this.assetsUnderManagement = assetsUnderManagement;
	}

	public double getCurrentNAV() {
		return currentNAV;
	}

	public void setCurrentNAV(double currentNAV) {
		this.currentNAV = currentNAV;
	}

	public double getExpenseRatio() {
		return expenseRatio;
	}

	public void setExpenseRatio(double expenseRatio) {
		this.expenseRatio = expenseRatio;
	}

	public double getExitLoad() {
		return exitLoad;
	}

	public void setExitLoad(double exitLoad) {
		this.exitLoad = exitLoad;
	}

	public int getManagerId() {
		return managerId;
	}

	public void setManagerId(int managerId) {
		this.managerId = managerId;
	}

	public Date getInceptionDate() {
		return inceptionDate;
	}

	public void setInceptionDate(Date inceptionDate) {
		this.inceptionDate = inceptionDate;
	}
	
	
	
	
}
