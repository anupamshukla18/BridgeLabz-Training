package com.digitalbookstoresystem;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private String userName;
	private List<Book> books = new ArrayList<>();
	private List<Integer> quantities = new ArrayList<>();

	private String status; // restricted access

	public Order(String userName) {
		this.userName = userName;
		this.status = "CREATED";
	}

	public void addBook(Book book, int quantity) {
		book.reduceStock(quantity);
		books.add(book);
		quantities.add(quantity);
	}

	public double calculateTotalCost() {

		double total = 0;

		for (int i = 0; i < books.size(); i++) {
			Book book = books.get(i);
			int qty = quantities.get(i);

			double price = book.price * qty;
			double discount = book.applyDiscount(qty);

			total += price - discount; // operators used
		}
		return total;
	}

	// Order status can be changed ONLY internally
	protected void updateStatus(String newStatus) {
		this.status = newStatus;
	}

	public String getStatus() {
		return status;
	}
}
