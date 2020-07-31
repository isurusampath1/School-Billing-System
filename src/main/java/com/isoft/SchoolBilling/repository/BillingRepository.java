package com.isoft.SchoolBilling.repository;

import com.isoft.SchoolBilling.enums.BillingStatus;
import com.isoft.SchoolBilling.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {

    List<Billing> findByBillingStatus(BillingStatus billingStatus);
}
