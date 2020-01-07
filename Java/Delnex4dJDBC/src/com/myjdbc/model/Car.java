package com.myjdbc.model;

public class Car {
	private String name;
	private int serialNo;
	private String maker;
	
	public Car() {
		super();
	}

	public Car(String name, int serialNo, String maker) {
		super();
		this.name = name;
		this.serialNo = serialNo;
		this.maker = maker;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", serialNo=" + serialNo + ", maker=" + maker + "]";
	}
	
	
}