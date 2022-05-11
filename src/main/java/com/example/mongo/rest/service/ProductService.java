package com.example.mongo.rest.service;

import com.example.mongo.rest.model.Product;

import java.util.List;

public interface ProductService {
    Product save(final Product product);
    List<Product> get();
}
