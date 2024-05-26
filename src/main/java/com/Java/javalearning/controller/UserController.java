package com.Java.javalearning.controller;

import com.Java.javalearning.entity.User;
import com.Java.javalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired private UserRepository userRepository;

    @GetMapping(value = "/user")
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
