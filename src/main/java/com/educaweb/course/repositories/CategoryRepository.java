package com.educaweb.course.repositories;

import com.educaweb.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepository extends JpaRepository<Category, Long> {
}