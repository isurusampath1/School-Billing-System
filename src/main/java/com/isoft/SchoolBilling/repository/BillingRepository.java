package com.isoft.SchoolBilling.repository;

import com.isoft.SchoolBilling.model.Billing;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Integer> {

    @Query(value = "SELECT student.admission_number,student.full_name,student.class_name,class_room.term_fee,class_room.security_fee\n" +
            "FROM student\n" +
            "JOIN class_room ON student.class_name = class_room.class_name ", nativeQuery = true)

    public List<Billing> findBilling();
}
