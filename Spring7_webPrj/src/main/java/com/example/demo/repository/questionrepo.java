package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Question;

@Repository
public interface questionrepo  extends JpaRepository<Question,Integer>{

	public void getAllQuestions() {
		// TODO Auto-generated method stub
		
	}
	
}