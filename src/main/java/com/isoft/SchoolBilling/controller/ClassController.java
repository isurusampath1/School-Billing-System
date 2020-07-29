package com.isoft.SchoolBilling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClassController {

    @GetMapping("/classes")
    public String getClasses(){
        return "classRoom";
    }
}
