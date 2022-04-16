package com.mishakov.springbootcrudwebapp.controllers;

import com.mishakov.springbootcrudwebapp.model.User;
import com.mishakov.springbootcrudwebapp.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class UserController {

    private final UserServices userServices;

    @Autowired
    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/users")
    public User saveUser(@RequestBody User user) {
        return userServices.saveUser(user);
    }

    @GetMapping("/users")
    public List<User> userList() {
        return userServices.userList();
    }

    @PutMapping("/users/{id}")
    public User updateUser(@RequestBody User user, @PathVariable("id") Long userId) {
        return userServices.updateUser(user, userId);
    }

    @DeleteMapping("users/{id}")
    public void deleteUserById(@PathVariable("id") Long userId) {
        userServices.deleteUserById(userId);
    }




}
