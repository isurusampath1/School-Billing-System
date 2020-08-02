package com.isoft.SchoolBilling.controller;

import com.isoft.SchoolBilling.dto.StudentDTO;
import com.isoft.SchoolBilling.service.ClassService;
import com.isoft.SchoolBilling.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService studentService;
    private final ClassService classService;


    @Autowired
    public StudentController(final StudentService studentService,
                             final ClassService classService) {
        this.studentService = studentService;
        this.classService = classService;
    }

    @GetMapping("/students")
    public ModelAndView getStudents(ModelAndView modelAndView,  BindingResult bindingResult){
        modelAndView.addObject("students",studentService.getStudents());
        modelAndView.addObject("studentClasses",classService.findAll());
        modelAndView.setViewName("student");
        return modelAndView;
    }

    @PostMapping("/students/addNew")
    public String addNewStudent(@ModelAttribute StudentDTO studentDTO, BindingResult bindingResult){
        studentService.saveStudent(studentDTO);
        return "redirect:/students";
    }
}
