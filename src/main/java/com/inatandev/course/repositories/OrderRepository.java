package com.inatandev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inatandev.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
