package com.isoft.SchoolBilling.controller;

import com.isoft.SchoolBilling.dto.BillingDTO;
import com.isoft.SchoolBilling.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BillingController {

    private final BillingService billingService;

    @Autowired
    public BillingController(final BillingService billingService) {
        this.billingService = billingService;
    }


    @GetMapping("/billings")
    public ModelAndView getBillings(ModelAndView modelAndView){
        List<BillingDTO> billingList = billingService.getBillingList();
        modelAndView.addObject("billingDetails", billingList);
        modelAndView.setViewName("billing");
        return modelAndView;
    }
}
