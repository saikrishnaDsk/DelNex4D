package com.myjdbc.model;

//import java.sql.Date;
import java.util.Date;

public class Customer {

	private String fname;
	private String lname;
	private String custid;
	private Date dob;

	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getCustid() {
		return custid;
	}
	public void setCustid(String custid) {
		this.custid = custid;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Customer(String fname, String lname, String custid, Date dob) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.custid = custid;
		this.dob = dob;
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [fname=" + fname + ", lname=" + lname + ", custid=" + custid + ", dob=" + dob + "]";
	}

}