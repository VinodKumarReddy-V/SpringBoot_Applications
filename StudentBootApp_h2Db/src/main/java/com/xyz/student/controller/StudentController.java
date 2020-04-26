package com.xyz.student.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.xyz.student.model.Student;
import com.xyz.student.repository.StudentRepository;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepository  repository;
	
	@PostMapping("/saveStudent")
	public String save(@RequestBody Student student) {
		String msg ="";
		
		System.out.println(student);
		System.out.println("Inside Controller Save Method");
		
		try {
			repository.save(student);
			msg = "Data Saved Successfully for -"+ student.getRollNumber();
		}catch(Exception e) {
			msg="Error in saving data";
		}
		return msg;

	
	}
	
	@GetMapping("getAllStudentDetails")
	public List<Student> findAll(){
		
		System.out.println("Inside getAll Student details");
		return repository.findAll();
		
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable("id")Integer id) {
		
		System.out.println("Inside Delete Method dtls");
		String msg = "";
		try {
			repository.deleteById(id);
			msg="Row delete successfully for "+ id;
		}catch (Exception e) {
			msg= e.getMessage() ;
		}
		return msg;
		
	}
}
