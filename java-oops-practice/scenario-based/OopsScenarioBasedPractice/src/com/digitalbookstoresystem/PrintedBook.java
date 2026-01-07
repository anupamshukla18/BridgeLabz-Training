package com.digitalbookstoresystem;

public class PrintedBook extends Book {
	public PrintedBook(String title, String author, double price, int stock) {
		super(title, author, price, stock);
	}

	@Override
	public double applyDiscount(int quantity) {
		// Buy 2 get 5% off
		if (quantity >= 2) {
			return price * quantity * 0.05;
		}
		return 0;
	}
}
