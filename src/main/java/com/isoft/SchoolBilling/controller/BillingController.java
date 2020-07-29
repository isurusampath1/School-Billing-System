package com.isoft.SchoolBilling.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BillingController {

    @GetMapping("/billings")
    public String getBillings(){
        return "billing";
    }
}
