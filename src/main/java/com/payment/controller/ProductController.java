package com.payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.pojo.Product;
import com.payment.repositiory.ProductRepositiory;

@RestController
@RequestMapping("/")
public class ProductController {
	@Autowired
	ProductRepositiory productRepositiory;
	
	@GetMapping("/get")
	public String go() {
		return "Hello Docker";
	}
	@GetMapping("/all")
	public Iterable<Product> getAll() {
		return productRepositiory.findAll();
	}
	@RequestMapping("/save")
	public Product saveproduct(@RequestBody Product product) {
		return productRepositiory.save(product);
	}

}
