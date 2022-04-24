package com.mishakov.springbootcrudwebapp.dao;

import com.mishakov.springbootcrudwebapp.model.User;
import com.mishakov.springbootcrudwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private  EntityManager entityManager;

    private final UserRepository userRepository;

    @Autowired
    public UserDaoImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> userList() {
        return userRepository.findAll();
    }

    @Override
    public User show(Long userId) {
        return entityManager.find(User.class, userId);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        entityManager.merge(user);
    }

    @Override
    @Transactional
    public void deleteUserById(Long userId) {
        userRepository.deleteById(userId);
    }
}
