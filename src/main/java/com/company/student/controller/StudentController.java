package com.company.student.controller;

import com.company.student.dto.StudentDto;
import com.company.student.entity.StudentEntity;
import com.company.student.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;


    @GetMapping("/get")
    public List<StudentDto> getAll () {
        return studentService.getAll();
    }

    @GetMapping("/get-by-id{id}")
    public StudentDto getById (@PathVariable Long id)  {
        return studentService.getById(id);
  }

    @PostMapping("/create")
    public ResponseEntity<String> create (@RequestBody StudentDto newStudent) {
         studentService.create(newStudent);

         return ResponseEntity.ok("Created!");
    }

    @PutMapping("/update{id}")
    public ResponseEntity<String> update (@PathVariable Long id, @RequestBody StudentDto updateS) {
        studentService.update(id, updateS);
        return ResponseEntity.ok("Updated!");

    }

    @DeleteMapping("/delete{id}")
    public ResponseEntity<String> delete (@PathVariable Long id) {
        studentService.delete(id);
        return ResponseEntity.ok("Student is deleted!");
    }
}
