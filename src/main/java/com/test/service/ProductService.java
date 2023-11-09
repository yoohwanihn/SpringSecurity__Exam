package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.Product;
import com.test.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }
}