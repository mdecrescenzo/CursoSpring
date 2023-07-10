package com.educaweb.course.repositories;

import com.educaweb.course.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}