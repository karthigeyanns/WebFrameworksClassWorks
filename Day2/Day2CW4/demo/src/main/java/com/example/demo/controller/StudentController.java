package com.example.demo.controller;

import java.sql.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
public class StudentController {
    Date a =new Date(0);
    @GetMapping("/book")
    public Book getMethodName() 
    {
        Book p = new Book("The Great Soldier", "G.Gyan", a);
        return p;
    }
}
