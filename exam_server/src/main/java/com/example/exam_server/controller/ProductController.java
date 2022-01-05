package com.example.exam_server.controller;


import com.example.exam_server.entity.ProductEntity;
import com.example.exam_server.model.BaseResponse;
import com.example.exam_server.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    IProductService productService;

    @GetMapping
    public BaseResponse getProduct(){
        BaseResponse res = new BaseResponse();
        res.datas = productService.getAllProducts();
        return res;
    }

    @PostMapping
    public BaseResponse addProduct(@RequestBody ProductEntity product) {
        BaseResponse res = new BaseResponse();
        res.data = productService.addProduct(product);
        return res;
    }

    @PutMapping
    public BaseResponse sellProduct(@RequestBody ProductEntity product) {
        BaseResponse res = new BaseResponse();
        res.data = productService.sellProduct(product.getId(), product.getQuantity());
        return res;
    }
}
