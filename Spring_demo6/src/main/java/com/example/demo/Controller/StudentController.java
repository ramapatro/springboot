package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.StudentRepository;
import com.example.demo.entity.Student_ent;

@RestController
@RequestMapping("/api/Stusave")
public class StudentController {

	private static final CrudRepository<Student_ent, Integer> StudentRepository = null;
	@Autowired
    private  StudentRepository studentRepository;

    @PostMapping("/save")
    public String save(@RequestBody Student_ent studentss) {
        studentRepository.save(studentss);
        return "data saved";
    }



//@DeleteMapping("/delete/{id}")
//	public String delete(@PathVariable int id)
//	{
//		boolean flag;
//		try {
//			flag = StudentRepository.existsById(id);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		if(flag) {
//			StudentRepository.deleteById(id);
//			return "student deleted" ;
//		}
//		else {
//			return "student data is not found";
//		}
//	}
    
    


@DeleteMapping("/delete/{id}")
public String delete(@PathVariable int id)
{
	boolean flag = studentRepository.existsById(id);
	if(flag) {
		studentRepository.deleteById(id);
		return "student deleted" ;
	}
	else {
		return "student data is not found";
	}
}

@PutMapping("/update/{id}")
public String update(@RequestBody Student_ent studentss, @PathVariable int id)
{
	Optional<Student_ent> optional = studentRepository.findById(id);
	Student_ent stu = optional.get();
	
	stu.setAge(studentss.getAge());
	stu.setName(studentss.getName());
	studentRepository.save(stu);
	return "data updated";
	
}

//@GetMapping("/getall")
//public List<Student_ent> getall(){
//	List<Student_ent>  sts = studentRepository.findAll();
//	return sts ;
//}

@GetMapping("/Getall")
public List<Student_ent> Getall(@RequestParam Integer age,@RequestParam String name)
{
	Student_ent st = new Student_ent();
	st.setAge(age);
	st.setName(name);
	Example<Student_ent> e = Example.of(st);
	List<Student_ent> all = studentRepository.findAll(e);
	for( Student_ent student:all)
	{
		System.out.println(student.getAge() + " "+ student.getName());
	}
	return studentRepository.findAll(e);
	
//	Getall?age=22&name=subu or "subu;(postman)
	
}

@GetMapping("/getbyage/{age}")
public List<Student_ent> getbyage(@PathVariable int age )
{
	return ((StudentRepository) studentRepository).getAllByAge(age);
}

//@GetMapping("/getall")
//public List<Student_ent> getall()
//{
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the page number");
//	int pageno = sc.nextInt();
//	int pagesize = 6 ;
//	PageRequest pageRequest =  PageRequest.of(pageno-1, pagesize);
//	
//	Page<Student_ent> findall = studentRepository.findAll(pageRequest);
//	List<Student_ent> content = findall.getContent();
//	
//	return content ;
//}


}
