package com.mishakov.springbootcrudwebapp.dao;

import com.mishakov.springbootcrudwebapp.model.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class UserDaoImp implements UserDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional
    public void saveUser(User user) {
        em.merge(user);
    }

    @Override
    public List<User> userList() {
        TypedQuery<User> namedQuery = em.createQuery("SELECT c from User c", User.class);
        return namedQuery.getResultList();
    }

    @Override
    public User show(Long userId) {
        return em.find(User.class, userId);
    }

    @Override
    @Transactional
    public void deleteUserById(Long userId) {
        em.remove(show(userId));
    }
}
