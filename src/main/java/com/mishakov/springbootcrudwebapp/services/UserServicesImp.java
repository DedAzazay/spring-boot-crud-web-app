package com.mishakov.springbootcrudwebapp.services;

import com.mishakov.springbootcrudwebapp.model.User;
import com.mishakov.springbootcrudwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImp implements UserServices {

    private UserRepository userRepository;

    @Autowired
    public UserServicesImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(User updateUser, Long userId) {
        User user = userRepository.findById(userId).get();

        //Check on "null" and empty values in future
        user.setName(updateUser.getName());
        user.setLastName(updateUser.getLastName());
        user.setEmail(updateUser.getEmail());


        return userRepository.save(user);
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
