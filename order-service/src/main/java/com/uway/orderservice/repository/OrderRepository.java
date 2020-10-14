package com.uway.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uway.orderservice.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

}
