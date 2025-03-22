package com.workdocker.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workdocker.app.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
