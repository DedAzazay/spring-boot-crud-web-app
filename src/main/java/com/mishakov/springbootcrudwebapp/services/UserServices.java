package com.mishakov.springbootcrudwebapp.services;

import com.mishakov.springbootcrudwebapp.model.User;

import java.util.List;

public interface UserServices {

    User saveUser(User user);

    List<User> userList();

    User updateUser(User updateUser, Long userId);

    void deleteUserById(Long userId);
}
