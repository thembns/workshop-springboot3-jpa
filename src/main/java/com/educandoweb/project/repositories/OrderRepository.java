package com.educandoweb.project.repositories;

import com.educandoweb.project.entities.Order;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository <Order, Long> {
}
