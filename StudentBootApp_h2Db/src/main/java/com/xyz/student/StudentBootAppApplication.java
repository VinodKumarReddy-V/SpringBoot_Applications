package com.xyz.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentBootAppApplication {

	public static void main(String[] args) {
		System.out.println("Spring Boot Application Starts");
		SpringApplication.run(StudentBootAppApplication.class, args);
	}

}
