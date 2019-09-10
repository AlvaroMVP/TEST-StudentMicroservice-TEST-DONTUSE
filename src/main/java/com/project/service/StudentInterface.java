package com.project.service;

import java.util.Date;

import com.project.model.Student;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface StudentInterface {
	
    void create (Student s) ;

   Flux<Student> findAll();
   Flux<Student> findByFullName(String fullName);
   Flux<Student> findByDocument(String Document);
   Flux<Student> findByDate(Date birthdate);

   Mono<Student> findById(String id);
   Mono<Student> save(Student student);
   Mono<Void> delete(String id);



}
