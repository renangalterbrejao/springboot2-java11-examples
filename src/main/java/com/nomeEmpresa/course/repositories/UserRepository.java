package com.nomeEmpresa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nomeEmpresa.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
