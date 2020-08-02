package com.isoft.SchoolBilling.service;

import com.isoft.SchoolBilling.dto.StudentDTO;
import com.isoft.SchoolBilling.mapper.BaseMapper;
import com.isoft.SchoolBilling.model.Student;
import com.isoft.SchoolBilling.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;
    private final BaseMapper<StudentDTO, Student> baseMapper;

    @Autowired
    public StudentService(final StudentRepository studentRepository,
                          final BaseMapper<StudentDTO, Student> baseMapper) {
        this.studentRepository = studentRepository;
        this.baseMapper = baseMapper;
    }


    public List<StudentDTO> getStudents(){
        return baseMapper.mapToDTOList(studentRepository.findAll());
    }

    public void saveStudent(StudentDTO studentDTO){
        studentRepository.save(baseMapper.mapToModel(studentDTO));
    }
}
