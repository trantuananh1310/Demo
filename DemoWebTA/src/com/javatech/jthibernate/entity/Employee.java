package com.javatech.jthibernate.entity;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = 6329454289569501949L;
	private int id;
	private String name;
	private String email;
	private Company company;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
}



