package com.example.exam_server.service;



import com.example.exam_server.entity.ProductEntity;

import java.util.ArrayList;

public interface IProductService {
    ArrayList<ProductEntity> getAllProducts();
    ProductEntity addProduct(ProductEntity p);
    boolean sellProduct(int productId, int quantity);
}
