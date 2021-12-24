package com.example.assigment_spring.repository;

import com.example.assigment_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Integer> {
    Optional<User> findByName(String name);
    List<User> findByNameLike(String name);
}

