package com.example.demo.entity;

import jakarta.persistence.Entity;

@Entity
public class Teacher {
	
	private int tea_id ;
	private String name ;
	private long phone_num ;
	private int age ;
	public int getTea_id() {
		return tea_id;
	}
	public void setTea_id(int tea_id) {
		this.tea_id = tea_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(long phone_num) {
		this.phone_num = phone_num;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
