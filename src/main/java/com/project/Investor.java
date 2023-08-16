package com.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Investor")
public class Investor {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	@Column(name = "investorId", insertable = false, updatable = false)
	int investorId;
	String firstName, lastName, Email,contactNumber;
	
	
	public Investor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Investor(int investorId, String firstName, String lastName, String email, String contactNumber) {
		super();
		this.investorId = investorId;
		this.firstName = firstName;
		this.lastName = lastName;
		Email = email;
		this.contactNumber = contactNumber;
	}


	public int getInvestorId() {
		return investorId;
	}


	public void setInvestorId(int investorId) {
		this.investorId = investorId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	
	

	
	
	
	
	
}
