package com.randtech.danielrt.order;

import com.randtech.danielrt.order.entities.OrderEntity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderEntity, Long> {

    
}
