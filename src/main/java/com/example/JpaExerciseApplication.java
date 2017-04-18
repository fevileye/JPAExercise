package com.example;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpaExerciseApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaExerciseApplication.class, args);
	}
	
	@Autowired
	private EmployeeRepository repository;
	
	@Bean
	public CommandLineRunner printAll(ApplicationContext ctx){
		return args->{
			Employee e= new Employee();
			e.setDob(new Date());
			e.setFirstName("Donny");
			e.setLastName("Sahur");
			e.setGender("Male");
			repository.save(e);
		};
	}
}
