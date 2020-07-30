package com.isoft.SchoolBilling.service;

import com.isoft.SchoolBilling.model.Student;
import com.isoft.SchoolBilling.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    //Get all Students
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    //Save new Student
    public void saveStudent(Student student){
        studentRepository.save(student);
    }
}
