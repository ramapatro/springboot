package com.example.demo.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="studentss")
public class Student_ent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id ;
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
	
	public int getId() {
		return id;
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
	public void setId(int id) {
		this.id = id;
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
	
	/**
	 * @param id
	 * @param name
	 * @param age
	 */
	public Student_ent(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public Student_ent() {
		
	}
	@Override
	public String toString() {
		return "Student_ent [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	

}
