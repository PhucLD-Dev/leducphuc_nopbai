package com.example.exam_spring.service;

import com.example.exam_spring.entity.EmployeEntity;

import java.util.List;

public interface EmployeService {
    List<EmployeEntity> getAllEmploye();
    EmployeEntity getEmployeById(int id);
    List<EmployeEntity> getEmployeByNameCustom(String name);
    EmployeEntity createEmploye(EmployeEntity p);
}
