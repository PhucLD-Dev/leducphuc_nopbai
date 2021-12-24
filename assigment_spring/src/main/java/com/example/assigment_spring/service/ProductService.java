package com.example.assigment_spring.service;

import com.example.assigment_spring.model.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    List<Product> getAllProduct();

    Product saveProduct(Product product);

    void deleteProduct(int id);

    Product getProductById(int id);

    List<Product> findByNameLike(String name);

    Page<Product> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
