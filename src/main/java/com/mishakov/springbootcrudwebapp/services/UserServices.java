package com.mishakov.springbootcrudwebapp.services;

import com.mishakov.springbootcrudwebapp.model.User;

import java.util.List;

public interface UserServices {

    void saveUser(User user);

    List<User> userList();

    User show(Long userId);

    void deleteUserById(Long userId);
}
