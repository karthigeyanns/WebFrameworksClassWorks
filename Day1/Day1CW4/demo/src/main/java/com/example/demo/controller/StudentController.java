package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.AddressModel;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {
    @GetMapping("/path")
    public AddressModel getMethodName() 
    {
        AddressModel obj = new AddressModel("Main St", 123, null, 0, null, null, null, null);
        return obj;
    }
    
}
