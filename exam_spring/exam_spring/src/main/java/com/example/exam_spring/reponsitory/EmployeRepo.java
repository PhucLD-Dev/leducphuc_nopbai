package com.example.exam_spring.reponsitory;

import com.example.exam_spring.entity.EmployeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeRepo extends JpaRepository<EmployeEntity, Integer> {

    EmployeEntity findByName(String name);

    @Query("select p from EmployeEntity p where p.name like %:name%")
    List<EmployeEntity> findEmployeByNameCustom(String name);
}
