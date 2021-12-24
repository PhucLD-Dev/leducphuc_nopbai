package com.example.assigment_spring.repository;

import com.example.assigment_spring.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepo extends JpaRepository<Product, Integer> {
    List<Product> findByNameLike(String name);
}
