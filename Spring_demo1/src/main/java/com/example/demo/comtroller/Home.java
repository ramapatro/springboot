
package com.example.demo.comtroller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.repository.Studentrepository;

@RestController
public class Home{
	
	@Autowired
	Studentrepository studentrepository ;
	
	@PostMapping("/home")
	public String home(@RequestBody Student st)
	{
		Student st1 = studentrepository.save(st);
		if(st1 != null) {
			return "data saved .....";
		}
		
		else 
		{
			return "data not saved ....";
		}
	}
	
//	used to get the all data 
	@GetMapping("/getall")
	public List<Student>getall()
	{
		List<Student> sts = studentrepository.findAll();
		return sts ;
		}
	
	@GetMapping("/findbyid/{id}")
	public Student findbyid(@PathVariable int id)
	{
		Optional<Student> stu = studentrepository.findById(id);
		if(stu.isPresent()) {
			return stu.get();
		}
		else {
			return null;
		}
	}
	

	
//	used to delete the dta by id from database
	@DeleteMapping("/deletebyid/{id}")
	public String  deletebyid(@PathVariable int id)
	{
		boolean flag = studentrepository.existsById(id);
		if(flag)
		{
			studentrepository.deleteById(id);
			return "deleted" ;
		}
		else {
			return "id not found";
		}
	}
	
	
//	update the data by id in database
	@PutMapping("/updatebyid")
	public  String  updatebyid(@RequestBody Student studnt )
	{
		int id = studnt.getId();
		Optional<Student> stu = studentrepository.findById(id);
		
		if(stu.isPresent()) {
			Student st3 = stu.get();
			st3.setAge(studnt.getAge());
			st3.setName(studnt.getName());
			Student savedata = studentrepository.save(st3);
			
			if(savedata!= null)
			{
				return "data updated";
			}
			else
			{
				return "data not updated";
			}
			
		}
		else 
		{
			return null ;
		}
		
			
	}
			
		}