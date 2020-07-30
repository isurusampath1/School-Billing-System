package com.isoft.SchoolBilling.controller;

import com.isoft.SchoolBilling.model.Student;
import com.isoft.SchoolBilling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/index")
    public String getHome(){
        return "index";
    }

    //Get Students
    @GetMapping("/students")
    public String getStudents(Model model){
        List<Student> studentList = studentService.getStudents();
        model.addAttribute("students",studentList);
        return "student";
    }

    //Add new Student
    @PostMapping("/students/addNew")
    public String addNewStudent(Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }


}
