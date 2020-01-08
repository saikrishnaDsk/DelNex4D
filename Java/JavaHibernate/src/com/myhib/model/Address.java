package com.myhib.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

		
	String street;
	String state;
	String city;

	public Address(String street, String state, String city) {
		super();
		this.street = street;
		this.state = state;
		this.city = city;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	public Address(){}

}