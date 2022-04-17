package com.mishakov.springbootcrudwebapp.services;

import com.mishakov.springbootcrudwebapp.dao.UserDao;
import com.mishakov.springbootcrudwebapp.model.User;
import com.mishakov.springbootcrudwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImp implements UserServices {

    private UserDao userDao;

    @Autowired
    public UserServicesImp(UserDao userRepository) {
        this.userDao = userRepository;
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
