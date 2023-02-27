package com.project.Medicare.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Medicare.Model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
		
	}