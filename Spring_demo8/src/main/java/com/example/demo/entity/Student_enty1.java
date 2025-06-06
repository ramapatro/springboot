package com.example.demo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="student_2")
public class Student_enty1 {
	
	@Id
	@Column(name = "Student_id")
	private StudentPk student_pk;
	private String name ;
	private int age ;
	
	@Column(name = "ACTIVE")
	private String activeSW ;
	
	
	@CreationTimestamp
	@Column(name = "insert_time",updatable= false)
	private LocalDateTime datetime ;
	
	@UpdateTimestamp
	@Column(name = "update_time",insertable=false)
	private LocalDateTime datetime2 ;
	
	public String getActiveSW() {
		return activeSW;
	}
	public void setActiveSW(String activeSW) {
		this.activeSW = activeSW;
	}
	public LocalDateTime getDatetime() {
		return datetime;
	}
	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}
	public LocalDateTime getDatetime2() {
		return datetime2;
	}
	public void setDatetime2(LocalDateTime datetime2) {
		this.datetime2 = datetime2;
	}
	public StudentPk getStudent_pk() {
		return student_pk;
	}
	public void setStudent_pk(StudentPk student_pk) {
		this.student_pk = student_pk;
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
