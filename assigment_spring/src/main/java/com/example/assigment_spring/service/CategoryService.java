package com.example.assigment_spring.service;

import com.example.assigment_spring.model.Category;
import org.springframework.data.domain.Page;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategory();

    Category saveCategory(Category category);

    void deleteCategory(int id);

    Category getCategoryById(int id);

    List<Category> findByNameLike(String name);

    Page<Category> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
