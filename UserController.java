package com.example.springbootdemo.controller;

import com.example.springbootdemo.model.User; 

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<User> getUsers() {
        return Arrays.asList(
            new User(1L, "Visi", "visi@gmail.com"),
            new User(2L, "Ram", "ram@gmail.com")
        );
    }
}
