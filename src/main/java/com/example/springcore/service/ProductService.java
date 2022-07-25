package com.example.springcore.service;

import com.example.springcore.repository.ProductRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
    @Getter
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public ProductService(ProductRepository productRepository, String name) {
        this.productRepository = productRepository;
    }
}
