package com.hibtask.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Table(name="Users")
@Entity
public class Users {
	@Id
	private int Userid;

	@Column(name = "user_name")
	private String name;

	@Type(type="yes_no")
	private boolean isActive;

	@Column(name = "date1")
	private Date date;

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Users(String name, boolean isActive, Date date) {
		super();
		this.name = name;
		this.isActive = isActive;
		this.date = date;
	}

	public Users() {
		super();
	}

	@Override
	public String toString() {
		return "Users [Userid=" + Userid + ", name=" + name + ", isActive=" + isActive + ", date=" + date + "]";
	}


}
