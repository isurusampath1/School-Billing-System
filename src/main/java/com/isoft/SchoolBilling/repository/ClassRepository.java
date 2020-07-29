package com.isoft.SchoolBilling.repository;

import com.isoft.SchoolBilling.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRepository extends JpaRepository<ClassRoom,String> {
}
