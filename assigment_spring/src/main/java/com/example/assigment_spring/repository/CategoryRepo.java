package com.example.assigment_spring.repository;

import com.example.assigment_spring.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
    List<Category> findByNameLike(String name);
}
