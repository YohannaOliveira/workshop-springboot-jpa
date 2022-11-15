package com.educandoweb.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespring.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
	
}
