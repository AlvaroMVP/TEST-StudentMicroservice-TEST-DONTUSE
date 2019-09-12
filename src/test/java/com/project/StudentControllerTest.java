package com.project;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.awt.PageAttributes.MediaType;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.project.controller.StudentController;
import com.project.model.Student;
import com.project.service.StudentInterface;


@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {

	@InjectMocks
	private StudentController studentController;
	
	@Mock
	private StudentInterface studentInterface;
	
	@Mock 
	private MockMvc mockMvc;
	
	@Before
	public void init() {
		mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
	}
	
	
	@Test
	public void findAll() throws Exception{
//		List <Student> student = new ArrayList<>();
//		Mockito.when(studentInterface.findAll()).thenReturn((Flux<Student>) student);
//		mockMvc.perform(MockMvcRequestBuilders.get("/student")
//				.accept(org.springframework.http.MediaType.APPLICATION_JSON)
//				.andDo(print())
//				.andExpect(status().isOk()));
	}
}
