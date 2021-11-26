package com.example.exam_spring.controller;

import com.example.exam_spring.entity.EmployeEntity;
import com.example.exam_spring.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeController {
    @Autowired
    EmployeService employeService;

    @GetMapping({"/", "/index"})
    public String index(Model model) {
//        String message = "Hello Spring Boot + jsp";
//        model.addAttribute("message", message);
        List<EmployeEntity> employees = employeService.getAllEmploye();
        model.addAttribute("employees", employees);
        return "index";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        // create model attribute to bind form data
        EmployeEntity employeEntity = new EmployeEntity();
        model.addAttribute("employeEntity", employeEntity);
        return "newproduct";
    }

    @PostMapping("/saveEmploye")
    public String createProduct(@ModelAttribute("employe") EmployeEntity p) {
        // save employee to database
        employeService.createEmploye(p);
        return "index";
    }
}
