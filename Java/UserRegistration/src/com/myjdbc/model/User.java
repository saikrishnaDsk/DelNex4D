package com.myjdbc.model;

public class User {
private String name;
private int id;
private String password;
private String gender;
private String email;


public User(String name, int id, String password, String gender, String email) {
	super();
	this.name = name;
	this.id = id;
	this.password = password;
	this.gender = gender;
	this.email = email;
}

public User() {
	super();
}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
@Override
public String toString() {
	return "User [name=" + name + ", id=" + id + ", password=" + password + ", gender=" + gender + ", email=" + email
			+ "]";
}

}
