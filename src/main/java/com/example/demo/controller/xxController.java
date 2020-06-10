package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class xxController {

    @GetMapping("xx")
    public String xx(){
        System.out.println("hello");
        return "hello jenkins";
    }
}
