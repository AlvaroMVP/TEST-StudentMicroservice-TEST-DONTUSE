package com.project.model;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "student")
public class Student {
  
  @Getter
  @Setter
  @Id
  private String id;
  private String fullName;
  private String gender;
  private Date birthdate;
  private String TypeDocument;
  private String NumberDocument;
    
}
