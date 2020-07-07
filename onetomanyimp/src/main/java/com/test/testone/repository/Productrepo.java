package com.test.testone.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.testone.models.Product;

public interface Productrepo extends JpaRepository<Product,Integer>{

}
