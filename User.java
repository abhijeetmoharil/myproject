package com.drhg.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loandetails")
public class User {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int cid;
	
	@Column(name="customer_name",nullable=false)
	private String cName;
	
	@Column(name="loan_amount",nullable=false)
	private int lamount;
	
	@Column(name="bank_details",nullable=false)
	private String bankdetails;
	
	@Column(name="aadharno",nullable=false)
	private String aadharno;
	
	public User() {
		
	}

	
	
	public User(String cName, int lamount, String bankdetails, String aadharno) {
		super();
		this.cName = cName;
		this.lamount = lamount;
		this.bankdetails = bankdetails;
		this.aadharno = aadharno;
	}



	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public int getLamount() {
		return lamount;
	}

	public void setLamount(int lamount) {
		this.lamount = lamount;
	}

	public String getBankdetails() {
		return bankdetails;
	}

	public void setBankdetails(String bankdetails) {
		this.bankdetails = bankdetails;
	}

	public String getAadharno() {
		return aadharno;
	}

	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}
}
	