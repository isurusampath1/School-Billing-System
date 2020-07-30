package com.isoft.SchoolBilling.controller;

import com.isoft.SchoolBilling.model.ClassRoom;
import com.isoft.SchoolBilling.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ClassController {

    @Autowired
    private ClassService classService;

    @GetMapping("/classes")
    public String getClasses(Model model){
        List<ClassRoom> classRoomList= classService.getAllClasses();
        model.addAttribute("classes",classRoomList);
        return "classRoom";
    }


    //Save ne Class
    @PostMapping("/classes/addNew")
    public String addNewClass(ClassRoom classRoom){
        classService.addNewClass(classRoom);
        return "redirect:/classes";
    }
}
