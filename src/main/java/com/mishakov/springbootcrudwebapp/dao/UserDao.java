package com.mishakov.springbootcrudwebapp.dao;

import com.mishakov.springbootcrudwebapp.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    List<User> userList();

    User show(Long userId);

    void deleteUserById(Long userId);
}
