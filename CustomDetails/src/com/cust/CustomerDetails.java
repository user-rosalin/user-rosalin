package com.cust;

import java.util.Date;

public class CustomerDetails {
	private String cid;
	private String customerName;
	private String date;
	private double amt;
	public String getCid() {
		return cid;
	}
	public void setCid(String cid) {
		this.cid = cid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public double getAmt() {
		return amt;
	}
	public void setAmt(double amt) {
		this.amt = amt;
	}
	@Override
	public String toString() {
		return "CustomerDetails [cid=" + cid + ", customerName=" + customerName + ", date=" + date + ", amt=" + amt
				+ "]";
	}
	

}
