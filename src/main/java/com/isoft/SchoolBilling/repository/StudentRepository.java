package com.isoft.SchoolBilling.repository;

import com.isoft.SchoolBilling.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {


}
