package com.educandoweb.coursespring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.coursespring.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
