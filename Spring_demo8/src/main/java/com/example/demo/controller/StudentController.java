package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentPk;
import com.example.demo.entity.Student_enty1;
import com.example.demo.repository.stuRepository;

@RestController
@RequestMapping("/api/stu")
public class StudentController {
	
	@Autowired
	private stuRepository studentrepository ;
	
	@PostMapping("/save")
	public String save(@RequestBody Student_enty1 student)
	{
		studentrepository.save(student);
		return "data saved";
	}
	
	@GetMapping("/getone")
	public Student_enty1 getone(@RequestBody  StudentPk studentpk)
	{
		Optional<Student_enty1> id = studentrepository.findById(studentpk);
		return id.get();
	}
	
//	@DeleteMapping("/del")
//	public String delete(@RequestBody StudentPk studentpk)
//	{
//		studentrepository.deleteById(studentpk);
//		return "deleted";
//	}
	
//	@PutMapping("/update")
//	public String update(@RequestBody StudentPk studentpk)
//	{
//		studentrepository.updateById(studentpk);
//		return "updated";
//	}

}
