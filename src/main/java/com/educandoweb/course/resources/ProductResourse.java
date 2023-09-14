package com.educandoweb.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.educandoweb.course.entities.Product;
import com.educandoweb.course.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResourse {
	
	@Autowired
	private ProductService categoryService;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> categorias = categoryService.findAll();
		return ResponseEntity.ok().body(categorias);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Product> findById(@PathVariable Integer id){
		Product Id = categoryService.findById(id);
		return ResponseEntity.ok().body(Id);
	}
}
