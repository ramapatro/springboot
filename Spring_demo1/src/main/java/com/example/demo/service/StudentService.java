package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	String saveStudent(Student st);
	
	List<Student> getallstudent();
	
	Student findbyStudentId(int id);
	
	String deleteStudentId(int id);
	
	String updateStudent(Student st);
}
