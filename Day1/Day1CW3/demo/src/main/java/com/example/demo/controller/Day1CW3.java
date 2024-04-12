package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class Day1CW3 {
    @GetMapping("/favoriteColor")
    public String getMethodName(@RequestParam String color) {
        return "My favorite color is "+color+"!";
    }
    
}
