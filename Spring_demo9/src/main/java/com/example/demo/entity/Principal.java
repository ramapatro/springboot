package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Principal {
	
	private int prn_id ;
	private String name ;
	private int age ;
	
	
	public int getPrn_id() {
		return prn_id;
	}
	public void setPrn_id(int prn_id) {
		this.prn_id = prn_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
