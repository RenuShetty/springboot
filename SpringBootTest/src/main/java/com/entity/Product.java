package com.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;



public class Product {

	private int pid;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
}
