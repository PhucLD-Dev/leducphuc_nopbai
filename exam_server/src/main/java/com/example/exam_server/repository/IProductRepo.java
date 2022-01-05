package com.example.exam_server.repository;


import com.example.exam_server.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductRepo extends JpaRepository<ProductEntity, Integer> {
}
