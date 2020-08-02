package com.isoft.SchoolBilling.repository;

import com.isoft.SchoolBilling.model.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClassRepository extends JpaRepository<ClassRoom,String> {

    Optional<ClassRoom> findById(int id);
}
