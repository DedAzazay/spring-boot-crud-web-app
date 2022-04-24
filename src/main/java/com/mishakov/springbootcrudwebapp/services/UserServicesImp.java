package com.mishakov.springbootcrudwebapp.services;

import com.mishakov.springbootcrudwebapp.dao.UserDao;
import com.mishakov.springbootcrudwebapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImp implements UserServices {

    private final UserDao userDao;

    @Autowired
    public UserServicesImp(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    @Override
    public List<User> userList() {
        return userDao.userList();
    }

    @Override
    public User show(Long userId) {
        return userDao.show(userId);
    }

    @Override
    public void deleteUserById(Long userId) {
        userDao.deleteUserById(userId);
    }
}
