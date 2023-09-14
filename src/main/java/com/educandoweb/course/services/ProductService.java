package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.repositories.ProductReposirory;
@Service
public class ProductService {

	@Autowired
	private ProductReposirory categoryReposirory;
	
	public List<Product> findAll(){
		return categoryReposirory.findAll();
	}
	
	public Product findById(Integer id) {
		Optional<Product> listId = categoryReposirory.findById(id);
		return listId.get();
	}
}
