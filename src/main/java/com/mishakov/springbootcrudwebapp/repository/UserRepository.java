package com.mishakov.springbootcrudwebapp.repository;

import com.mishakov.springbootcrudwebapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
