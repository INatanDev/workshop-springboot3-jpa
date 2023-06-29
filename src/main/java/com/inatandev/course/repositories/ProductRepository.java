package com.inatandev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inatandev.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
