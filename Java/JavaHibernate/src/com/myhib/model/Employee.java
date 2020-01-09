package com.myhib.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="Employee")
@Entity
public class Employee {
	
	@Id
	int empid;
	String empname;
	int age;
	String dep;
	String city;
	
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public Employee(int empid, String empname, int age, String dep, String city) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.age = age;
		this.dep = dep;
		this.city = city;
	}
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", age=" + age + ", dep=" + dep + ", city=" + city
				+ "]";
	}
	
	
}
