package com.nomeEmpresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomeEmpresa.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
