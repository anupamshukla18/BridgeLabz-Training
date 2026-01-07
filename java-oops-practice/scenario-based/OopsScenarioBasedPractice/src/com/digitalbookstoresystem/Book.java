package com.digitalbookstoresystem;

public abstract class Book implements IDiscountable {
	protected String title;
	protected String author;
	protected double price;

	private int stock; // encapsulated

	public Book(String title, String author, double price, int stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}

	public int getStock() {
		return stock;
	}

	// Inventory can be updated ONLY via method
	public void reduceStock(int quantity) {
		if (quantity <= stock) {
			stock -= quantity;
		} else {
			throw new IllegalArgumentException("Insufficient stock");
		}
	}

	public abstract double applyDiscount(int quantity);
}
