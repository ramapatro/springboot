package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class mycontroller{
	
	@GetMapping("/")
	@ResponseBody
	public String printHello()
	{
		return "hello subhalaxmi" ;
	}
	
}