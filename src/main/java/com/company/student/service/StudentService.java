package com.company.student.service;

import com.company.student.dto.StudentDto;
import com.company.student.entity.StudentEntity;
import com.company.student.mapper.StudentMapper;
import com.company.student.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService {

    private  final StudentRepository studentRepository;
    private  final StudentMapper studentMapper;


    public  List<StudentDto> getAll () {
        List<StudentEntity> getAll = studentRepository.findAll();
        return studentMapper.mapToDto1(getAll);

    }

    public  StudentDto getById (Long id) {
        StudentEntity studentEntity = studentRepository.findById(id).orElseThrow();
        StudentDto studentDto = studentMapper.mapToDto2(studentEntity);
        return studentDto;
    }

    public  void create (StudentDto studentDto) {
        StudentEntity studentEntity1 = studentMapper.mapToDto3(studentDto);
        studentRepository.save(studentEntity1);


    }

    public  void delete (Long id) {
        StudentEntity student = studentRepository.findById(id).orElseThrow();
        studentRepository.delete(student);
    }

    public  void  update (Long id, StudentDto studentDto) {
        StudentEntity student = studentRepository.findById(id).orElseThrow();
        studentMapper.update(student, studentDto);
        studentRepository.save(student);




    }
}
