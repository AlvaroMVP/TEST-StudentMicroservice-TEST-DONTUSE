package com.project.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.project.model.Student;

public interface StudentRepository extends ReactiveMongoRepository<Student, String> {
	
	

}
