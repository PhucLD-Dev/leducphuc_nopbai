package com.example.assigment_spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class WebController {

    @GetMapping("/")
    public String index(HttpSession session){
        if(session.getAttribute("NAME") != null){
            return "index";
        }
        return "login";
    }

}
