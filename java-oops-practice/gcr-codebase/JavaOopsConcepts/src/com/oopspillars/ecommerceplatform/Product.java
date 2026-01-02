package com.oopspillars.ecommerceplatform;

abstract class Product {
	private String productId;
	private String name;
	private double price;

	// Constructor
	public Product(String productId, String name, double price) {
		this.productId = productId;
		this.name = name;
		this.price = price;
	}

	// Encapsulation: Getters
	public String getProductId() {
		return productId;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	// Encapsulation: Setters
	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		if (price > 0)
			this.price = price;
	}

	// Abstract Method
	public abstract double calculateDiscount();

	// Display Product Details
	public void displayDetails() {
		System.out.println("Product ID: " + productId);
		System.out.println("Name: " + name);
		System.out.println("Price: " + price);
	}
}