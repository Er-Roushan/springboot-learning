package com.roushan.SimpleWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.roushan.SimpleWebApp.model.Product;

@Service
public class ProductService {
	
	List<Product> products = new ArrayList<Product>(
			Arrays.asList(new Product(101, "Trolley Bag", 1400), new Product(102, "Laptop", 72000)));

	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return products;
	}

	public Product getProdWithId(int prodID) {
		// TODO Auto-generated method stub
		return products.stream().filter(p -> p.getPid() == prodID).findFirst().orElse(new Product());
	}

	public String addProduct(Product prod) {
		// TODO Auto-generated method stub
		products.add(prod);
		return "Product Successfully added, Hit get request to verify";
	}

	public String putMethod(Product prod) {
		// TODO Auto-generated method stub
		 for (Product p : products) {
		        if (p.getPid() == prod.getPid()) {
		            p.setName(prod.getName());
		            p.setPrice(prod.getPrice());
		            break; 
		        }
		    }
		return "Successfully updated, Hit get request to verify";
	}

	public String deleteAProd(int prodID) {
		// TODO Auto-generated method stub
		for(int i =0; i<products.size(); i++) {
			if(products.get(i).getPid() == prodID) {
				products.remove(i);
			}
		}
		return "Successfully deleted, Hit get request to verify";
	}

}
