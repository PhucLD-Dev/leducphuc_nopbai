package com.example.exam_server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @GetMapping({"/", "index"})
    public String index() {
        return "index";
    }

    @GetMapping("/add")
    public String addProduct() {
        return "add";
    }

    @GetMapping("/sell")
    public String sellProduct(Model model, @RequestParam Integer id) {
        model.addAttribute("id", id);
        return "sell";
    }

}
