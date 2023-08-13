package com.project;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="MutualFund")
public class MutualFund {

	@Id
	int FundID ;
	String FundName;
	double AssetsUnderManagement, CurrentNAV, ExpenseRatio, ExitLoad;
	int ManagerID;
	Date InceptionDate;
	
	public MutualFund() {
		super();
	}
	
	public MutualFund(int fundID, String fundName, double assetsUnderManagement, double currentNAV, double expenseRatio,
			double exitLoad, int managerID, Date inceptionDate) {
		super();
		FundID = fundID;
		FundName = fundName;
		AssetsUnderManagement = assetsUnderManagement;
		CurrentNAV = currentNAV;
		ExpenseRatio = expenseRatio;
		ExitLoad = exitLoad;
		ManagerID = managerID;
		InceptionDate = inceptionDate;
	}
	
	
	public int getFundID() {
		return FundID;
	}
	public void setFundID(int fundID) {
		FundID = fundID;
	}
	public String getFundName() {
		return FundName;
	}
	public void setFundName(String fundName) {
		FundName = fundName;
	}
	public double getAssetsUnderManagement() {
		return AssetsUnderManagement;
	}
	public void setAssetsUnderManagement(double assetsUnderManagement) {
		AssetsUnderManagement = assetsUnderManagement;
	}
	public double getCurrentNAV() {
		return CurrentNAV;
	}
	public void setCurrentNAV(double currentNAV) {
		CurrentNAV = currentNAV;
	}
	public double getExpenseRatio() {
		return ExpenseRatio;
	}
	public void setExpenseRatio(double expenseRatio) {
		ExpenseRatio = expenseRatio;
	}
	public double getExitLoad() {
		return ExitLoad;
	}
	public void setExitLoad(double exitLoad) {
		ExitLoad = exitLoad;
	}
	public int getManagerID() {
		return ManagerID;
	}
	public void setManagerID(int managerID) {
		ManagerID = managerID;
	}
	public Date getInceptionDate() {
		return InceptionDate;
	}
	public void setInceptionDate(Date inceptionDate) {
		InceptionDate = inceptionDate;
	}
}
