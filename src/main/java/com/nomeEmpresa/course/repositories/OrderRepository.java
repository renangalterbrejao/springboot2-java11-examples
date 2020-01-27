package com.nomeEmpresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomeEmpresa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
