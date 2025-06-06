package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepository;

@Service
public class studentServicelmplement implements StudentService{
	
	@Autowired
	Studentrepository studentrepositry;
	
	@Override
	public String saveStudent(Student st)
	{
		Student st4 = studentrepositry.save(st);
		if(st4!= null)
		{
			return "data saved";
		}
		else  {
			return "data not saved";
		}
	}

	@Override
	public List<Student> getallstudent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student findbyStudentId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteStudentId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateStudent(Student st) {
		// TODO Auto-generated method stub
		return null;
	}
	
}