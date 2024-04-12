package com.example.demo.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.model.StudentModel;

public class StudentController {
    @GetMapping("/allstudents")
    public List<StudentModel> getMethodName() {
        List<StudentModel> studentList = new ArrayList<StudentModel>();
        StudentModel p = new StudentModel(101, "Ezhil");
        studentList.add(p);
        StudentModel q = new StudentModel(102, "senthil");
        studentList.add(q);
        return studentList;
    }
}


