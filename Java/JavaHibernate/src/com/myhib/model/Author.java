package com.myhib.model;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Author {

	@Id
	int authorId;
	String name;
	int noOfBooks;
	Date regDate;

	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="street",column=@Column(name="Home_Street")),
		@AttributeOverride(name="city",column=@Column(name="Home_City")),
		@AttributeOverride(name="state",column=@Column(name="Home_State")),
})
	private Address homeAddress;
	private Address officeAddress;
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNoOfBooks() {
		return noOfBooks;
	}
	public void setNoOfBooks(int noOfBooks) {
		this.noOfBooks = noOfBooks;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	@Override
	public String toString() {
		return "Author [authorId=" + authorId + ", name=" + name + ", noOfBooks=" + noOfBooks + ", regDate=" + regDate
				+ ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + "]";
	}
	public Author(int authorId, String name, int noOfBooks, Date regDate, Address homeAddress, Address officeAddress) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.noOfBooks = noOfBooks;
		this.regDate = regDate;
		this.homeAddress = homeAddress;
		this.officeAddress = officeAddress;
	}
	public Author() {
		super();
	}
	
	

}
