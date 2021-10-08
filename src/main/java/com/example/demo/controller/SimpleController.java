package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring-test")
public class SimpleController {

    @GetMapping("/foo")
    @ResponseStatus(HttpStatus.OK)
    public void foo(String requestString) {
        System.out.println("Got GET request from client: " + requestString);
    }
}