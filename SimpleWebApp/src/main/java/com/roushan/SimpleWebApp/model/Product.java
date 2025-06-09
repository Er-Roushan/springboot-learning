package com.roushan.SimpleWebApp.model;

import org.springframework.stereotype.Component;


@Component
public class Product {
	// @Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	private String name;
	private int price;

	public Product(int pid, String name, int price) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product() {

	}

	// as lombok is there it will take care of setter and getter
}
