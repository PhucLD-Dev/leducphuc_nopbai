package com.example.exam_spring.service;

import com.example.exam_spring.entity.EmployeEntity;
import com.example.exam_spring.reponsitory.EmployeRepo;
import org.springframework.stereotype.Service;


import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class EmployeServiceImpl implements EmployeService{

    @Autowired
    EmployeRepo employeRepo;

    @Override
    public List<EmployeEntity> getAllEmploye() {
        return employeRepo.findAll();
    }

    @Override
    public EmployeEntity getEmployeById(int id) {
        return employeRepo.findById(id).get();
    }

    @Override
    public List<EmployeEntity> getEmployeByNameCustom(String name) {
        return employeRepo.findEmployeByNameCustom(name);
    }

    @Override
    public EmployeEntity createEmploye(EmployeEntity p) {
        return employeRepo.save(p);
    }
}
