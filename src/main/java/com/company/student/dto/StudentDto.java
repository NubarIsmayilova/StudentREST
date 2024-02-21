package com.company.student.dto;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@Builder

public class StudentDto {
    private String firstName;
    private String lastName;
    private String email;
    private  int age;
}
