package com.example.duongquocviet.service;

import com.example.duongquocviet.entity.Product;
import com.example.duongquocviet.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll(){
        return productRepository.findAll();
    }
    public Product save(Product product){
        return productRepository.save(product);
    }


}
