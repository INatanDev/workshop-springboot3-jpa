package com.inatandev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inatandev.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
