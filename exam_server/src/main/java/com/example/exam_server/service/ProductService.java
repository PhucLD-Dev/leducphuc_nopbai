package com.example.exam_server.service;


import com.example.exam_server.entity.ProductEntity;
import com.example.exam_server.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ProductService implements IProductService{

    @Autowired
    IProductRepo productRepo;

    @Override
    public ArrayList<ProductEntity> getAllProducts() {
        return (ArrayList<ProductEntity>) productRepo.findAll();
    }

    @Override
    public ProductEntity addProduct(ProductEntity p) {
        return productRepo.save(p);
    }

    @Override
    public boolean sellProduct(int productId, int quantity) {
        ProductEntity p = productRepo.findById(productId).get();
        if(p != null){
            if(p.getQuantity() >= quantity){
                p.setQuantity(p.getQuantity() - quantity);
                productRepo.save(p);
                return true;
            }
        }
        return false;
    }
}
