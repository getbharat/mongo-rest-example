package com.example.mongo.rest.service.impl;

import com.example.mongo.rest.dao.ProductRepository;
import com.example.mongo.rest.model.Product;
import com.example.mongo.rest.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Override
    public Product save(Product product) {
        return productRepository.insert(product);
    }

    @Override
    public List<Product> get() {
        return productRepository.findAll();
    }
}
