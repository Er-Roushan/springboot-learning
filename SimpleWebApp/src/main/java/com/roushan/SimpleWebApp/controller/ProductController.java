package com.roushan.SimpleWebApp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.roushan.SimpleWebApp.model.Product;
import com.roushan.SimpleWebApp.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

	@Autowired
	private ProductService service;

	@RequestMapping("/")
	public String greet() {
		return "Hello";
	}

	@GetMapping("/products")
	public List<Product> getAll() {
		return service.getAllProduct();
	}

	@GetMapping("/products/{prodID}")
	public Product getSpecificProd(@PathVariable int prodID) {
		return service.getProdWithId(prodID);
	}

	@PostMapping("/addprod")
	public String addProd(@RequestBody Product prod) {
		return service.addProduct(prod);
	}

	@PutMapping("/modifyprod")
	public String modProd(@RequestBody Product prod) {

		return service.putMethod(prod);
	}

	@DeleteMapping("/deleteprod/{prodID}")
	public String delProd(@PathVariable int prodID) {
		return service.deleteAProd(prodID);
	}
}
