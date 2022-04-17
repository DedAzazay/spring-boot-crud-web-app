package com.mishakov.springbootcrudwebapp.services;

import com.mishakov.springbootcrudwebapp.repository.UserRepository;
import com.mishakov.springbootcrudwebapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServicesImp implements UserServices {

    private final UserRepository UserRepository;

    @Autowired
    public UserServicesImp(UserRepository userRepository) {
        this.UserRepository = userRepository;
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        UserRepository.save(user);
    }

    @Override
    public List<User> userList() {

        return UserRepository.findAll();
    }

    @Override
    public User show(Long userId) {
        return UserRepository.findById(userId).get();
    }

    @Override
    @Transactional
    public void deleteUserById(Long userId) {
        UserRepository.deleteById(userId);
    }
}
