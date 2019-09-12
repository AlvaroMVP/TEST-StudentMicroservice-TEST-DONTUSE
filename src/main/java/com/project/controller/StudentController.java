package com.project.controller;

import com.project.model.Student;
import com.project.repository.StudentRepository;
import com.project.service.StudentInterface;
import com.project.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

  @Autowired
  private StudentServiceImpl studentServiceImpl;
  
  @GetMapping("/student")
  public Flux<Student> findAll() {
    return studentServiceImpl.findAll();
  }

  @GetMapping("/student/{id}")
  public Mono<Student> getStudent(@PathVariable String id) {
    return studentServiceImpl.findById(id);
  }


  @GetMapping("student/numberDocument")
  public Mono<Student> findByDocument(@RequestParam("number") String numberDocument) {
    return studentServiceImpl.findBynumberDocument(numberDocument);
  }


  @GetMapping("student/fullName")
  public Flux<Student> findFullName(@RequestParam("filter") String fullName) {
    return studentServiceImpl.findByFullName(fullName);
  }
  
  @PostMapping("/student")
  public void create(@RequestBody Student student) {
    studentServiceImpl.create(student);
  }
  
  @PutMapping("/student")
  public Mono<Student> save(@RequestBody Student student) {
    return studentServiceImpl.save(student);
  }

  @DeleteMapping("/student/{id}")
  public void delete(@PathVariable("id") String id) {
    studentServiceImpl.delete(id).subscribe();
  }

}
