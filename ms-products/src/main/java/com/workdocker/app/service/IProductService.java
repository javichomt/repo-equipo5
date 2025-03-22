package com.workdocker.app.service;

import java.util.List;
import java.util.Optional;

import com.workdocker.app.entities.Product;

public interface IProductService {
	    List<Product> findAll();
	    Optional<Product> findById(Long id);
	    Product save(Product product);
	    void deleteById(Long id);
}
