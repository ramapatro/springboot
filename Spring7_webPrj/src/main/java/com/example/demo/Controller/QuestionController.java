package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Question;
import com.example.demo.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController{
	
	@Autowired
	QuestionService questionservice ;
	
	@GetMapping("/allquestions")
	public List<Question> getAllQuestion()
	{
		return questionservice.getAllQuestion() ; 
	}
	
}