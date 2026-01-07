package com.digitalbookstoresystem;

public class EBook extends Book {
	public EBook(String title, String author, double price, int stock) {
		super(title, author, price, stock);
	}

	@Override
	public double applyDiscount(int quantity) {
		// Flat 15% discount on eBooks
		return price * quantity * 0.15;
	}
}
