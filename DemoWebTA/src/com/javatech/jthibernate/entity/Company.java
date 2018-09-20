package com.javatech.jthibernate.entity;

import java.io.Serializable;
import java.util.Set;

public class Company implements Serializable{

	private static final long serialVersionUID = 6329454289569501949L;
	private int id;
	private String name;
	private Set<Employee> lsEmp ;//tập hợp, viết hoa ntnay
	
	public int getId() {
		return id;
	}
	public Set<Employee> getLsEmp() {
		return lsEmp;
	}
	public void setLsEmp(Set<Employee> lsEmp) {
		this.lsEmp = lsEmp;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
		// comment 20/9/2018
	}
	
}



