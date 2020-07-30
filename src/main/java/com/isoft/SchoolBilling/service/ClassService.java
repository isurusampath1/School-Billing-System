package com.isoft.SchoolBilling.service;

import com.isoft.SchoolBilling.model.ClassRoom;
import com.isoft.SchoolBilling.repository.ClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassService {

    @Autowired
    private ClassRepository classRepository;

    //Add New Class
    public void addNewClass(ClassRoom classRoom){
        classRepository.save(classRoom);
    }

    //Get All classes

    public List<ClassRoom> getAllClasses(){
        return classRepository.findAll();
    }
}
