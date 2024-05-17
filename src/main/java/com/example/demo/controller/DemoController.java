package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemoController {

    @GetMapping("/users")
    public List<String> getUsers() {
        //throw new RuntimeException();
        return List.of("test", "test1");
    }

    @GetMapping("/")
    public String getString() {
        //throw new RuntimeException();
        return "Hello!";
    }
}
