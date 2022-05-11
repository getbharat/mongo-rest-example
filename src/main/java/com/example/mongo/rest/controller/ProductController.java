package com.example.mongo.rest.controller;

import com.example.mongo.rest.model.Product;
import com.example.mongo.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public Product addProduct(@RequestBody final Product product){
       return productService.save(product);
    }
    @GetMapping("/get")
    public List<Product> addProduct(){
        return productService.get();
    }
}
