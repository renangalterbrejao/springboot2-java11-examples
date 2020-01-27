package com.nomeEmpresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomeEmpresa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
