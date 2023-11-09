package com.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.test.service.ProductService;

@Controller
public class MainPageController {
    @Autowired
    private ProductService productService;

    @GetMapping("/main")
    public String main(Authentication a, Model model) {
        model.addAttribute("memberName", a.getName());
        model.addAttribute("products", productService.findAll());
        return "main.html";
    }
    
    @GetMapping("/index")
    public String index(Authentication a, Model model) {
        return "index.html";
    }
}