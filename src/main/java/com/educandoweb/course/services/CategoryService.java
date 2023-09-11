package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.educandoweb.course.config.CategoryReposirory;
import com.educandoweb.course.entities.Category;
@Service
public class CategoryService {

	@Autowired
	private CategoryReposirory categoryReposirory;
	
	public List<Category> findAll(){
		return categoryReposirory.findAll();
	}
	
	public Category findById(Integer id) {
		Optional<Category> listId = categoryReposirory.findById(id);
		return listId.get();
	}
}
