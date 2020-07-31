package com.isoft.SchoolBilling.controller;

import com.isoft.SchoolBilling.model.Billing;
import com.isoft.SchoolBilling.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class BillingController {

    @Autowired
    private BillingService billingService;

    //get Billing details
    @GetMapping("/billings")
    public String getBillings(Model model){
        List<Billing> billingList = billingService.getNotPaidStudentList();
        model.addAttribute("billingDetails", billingList);
        return "billing";
    }
}
