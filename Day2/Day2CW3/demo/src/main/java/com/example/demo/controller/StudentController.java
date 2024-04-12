package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class StudentController {
    @GetMapping("/path")
    public Student getMethodName() {
        Student a = new Student(1L, "John Doe", "This is a student description");
        return a;
    }
}
