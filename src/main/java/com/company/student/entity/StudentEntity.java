package com.company.student.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table (name = "Students")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class StudentEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
   private String lastName;
   private String email;
    private  int age;

}
