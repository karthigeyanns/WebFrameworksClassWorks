package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Day2 {
    @GetMapping("/students")
    public String getMethodName(@PathVariable("name") String studentName) {
        return "welcome "+studentName+"!";
    }
}

