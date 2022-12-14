package com.educandoweb.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}