package com.inatandev.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inatandev.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
