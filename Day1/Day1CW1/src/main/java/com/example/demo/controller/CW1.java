package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CW1 {
    @GetMapping("/welcome")
    public String get()
    {
        return "Welcome Spring Boot!";
    }
}

