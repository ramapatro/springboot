package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Question;
import com.example.demo.repository.questionrepo;

@Service 
public class QuestionService{

	
	@Autowired
	questionrepo questionrepository ;
	
	public Question getAllQuestions() {
		questionrepository.getAllQuestions();
	}

	public List<Question> getAllQuestion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}