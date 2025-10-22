package com.example.springboot_webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWorld {
    @GetMapping("/hello")
    public String hello(){
        return "Hello world!";
    }

    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg", "test");
        return "test";
    }
}
