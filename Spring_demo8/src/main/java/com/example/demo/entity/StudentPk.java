package com.example.demo.entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class StudentPk {
	Integer stid ;
	String emailId ;
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public Integer getStid() {
		return stid;
	}
	public void setStid(Integer stid) {
		this.stid = stid;
	}

}



