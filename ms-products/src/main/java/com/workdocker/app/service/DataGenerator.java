package com.workdocker.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import com.workdocker.app.entities.Product;
import com.workdocker.app.repository.ProductRepository;

@Component
public class DataGenerator {
    ProductRepository productRepository;

    @Autowired
    protected DataGenerator(ProductRepository productRepository) {
        this.productRepository = productRepository;
        loadProducs();
    }
    
    @Transactional
    public void loadProducs() {
    	productRepository.save(new Product("MACBOOK AIR", "LAPTOP MACBOOK ", 3600.00));
    	productRepository.save(new Product("HP 7I", "LAPTOP HP 7I ", 2500.00));
    	productRepository.save(new Product("DELL 5I", "LAPTOP DELL 5I ", 1500.00));
    }
}
