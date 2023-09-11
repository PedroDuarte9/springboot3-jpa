package com.educandoweb.course.config;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.course.entities.Category;

public interface CategoryReposirory extends JpaRepository<Category, Integer> {

}
