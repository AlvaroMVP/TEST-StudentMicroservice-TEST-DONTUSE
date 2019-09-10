package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Student;
import com.project.repository.StudentRepository;
import com.project.service.StudentInterface;
import com.project.service.StudentServiceImpl;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController 	{	
	
	@Autowired
	private StudentRepository studentRepository;
	

	@GetMapping("/all")
	public Flux<Student> findAll(){
		return studentRepository.findAll();
	}
	
	@GetMapping("/get/student/{id}")
	public Mono<Student> getStudent(@PathVariable String id) {
		return studentRepository.findById(id);
	}
		
}
