package com.company.student.mapper;

import com.company.student.dto.StudentDto;
import com.company.student.entity.StudentEntity;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.util.List;


@Component
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        injectionStrategy = InjectionStrategy.CONSTRUCTOR
)
public interface StudentMapper {

    List<StudentDto> mapToDto1 (List<StudentEntity > studentEntityList);

    StudentDto mapToDto2 (StudentEntity studentEntity);


    StudentEntity mapToDto3 (StudentDto studentDto);

    void update (@MappingTarget  StudentEntity studentEntity, StudentDto studentDto);



}
