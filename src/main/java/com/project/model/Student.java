package com.project.model;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;




@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "student")

public class Student implements Serializable {
  private static final long serialVersionUID = 1L;
  @Id
  @NotNull
  private String id;
  private String fullName;
  private String gender;
  private String birthdate;
  private String typeDocument;
  private String numberDocument;
 
}
