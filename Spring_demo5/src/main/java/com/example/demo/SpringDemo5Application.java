package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringDemo5Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemo5Application.class, args);
	}
	
	@Override
	public void run(String...args) throws Exception
	{
		myClass().printMessage("subhalaxmi");
	}
	
	@Bean
	public MyClass myClass()
	{
		return new MyClass();
	}

}
