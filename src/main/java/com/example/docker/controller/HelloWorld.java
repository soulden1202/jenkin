package com.example.docker.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@CrossOrigin
public class HelloWorld {

    @GetMapping("/hello")
    public String getMethodName() {
        return new String("Hello world");
    }

}
