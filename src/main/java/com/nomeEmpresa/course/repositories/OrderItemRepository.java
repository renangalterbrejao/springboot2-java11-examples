package com.nomeEmpresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomeEmpresa.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
