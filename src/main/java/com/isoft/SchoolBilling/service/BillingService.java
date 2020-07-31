package com.isoft.SchoolBilling.service;

import com.isoft.SchoolBilling.enums.BillingStatus;
import com.isoft.SchoolBilling.model.Billing;
import com.isoft.SchoolBilling.repository.BillingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BillingService {

    @Autowired
    private BillingRepository billingRepository;

//    public List<Billing> getDetails(){
//        return billingRepository.findBilling();
//    }

    public List<Billing> getNotPaidStudentList() {
        return billingRepository.findByBillingStatus(BillingStatus.NOT_PAID);
    }
}
