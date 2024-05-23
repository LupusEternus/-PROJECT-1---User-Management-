package com.wilk.springboot.repository;

import com.wilk.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    //custom queries method
    Optional<User> findByEmail(String email);
}
