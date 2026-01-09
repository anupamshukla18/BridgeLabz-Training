package com.foodloopresturantorderingsystem;

abstract class FoodItem {
	private String name;
	private String category;
	protected double price;
	private int stock; // encapsulated

	public FoodItem(String name, String category, double price, int stock) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
	}

	public boolean isAvailable() {
		return stock > 0;
	}

	protected void reduceStock() {
		stock--;
	}

	public double getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
}
