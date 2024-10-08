package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class Welcome {

    @GetMapping("/hello")
    public String getMethodName() {
        return "hello";
    }

    @GetMapping("/thymeleaf")
    public String showThymeleafPage() {
        return "index"; // Refers to index.html in the templates folder
    }

    
    
}
