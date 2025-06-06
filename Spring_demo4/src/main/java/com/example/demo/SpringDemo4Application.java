package com.example.demo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Students;
import com.example.repository.Studentrepo;

@SpringBootApplication
public class SpringDemo4Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(SpringDemo4Application.class, args);
	System.out.println(context.getClass().getName());
	
	Studentrepo repoitory = context.getBean(Studentrepo.class);
	
	Students st1 = new Students();
	st1.setId(101);
	st1.setName("subuu");
	st1.setAge(21);
	
	
	Students st2 = new Students();
	st2.setId(102);
	st2.setName("nanuuu");
	st2.setAge(3);

	Students st3 = new Students();
	st3.setId(103);
	st3.setName("subhalaxmi");
	st3.setAge(22);

	repoitory.save(st1);
	repoitory.save(st2);
	repoitory.save(st3);
	
	
	}

}
