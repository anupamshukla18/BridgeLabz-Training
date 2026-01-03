package com.oopspillars.librarymanagementsystem;

public abstract class LibraryItem {
	// Encapsulated fields
	private int itemId;
	private String title;
	private String author;

	// Sensitive borrower data (private)
	private String borrowerName;
	private boolean isAvailable = true;

	// Constructor
	public LibraryItem(int itemId, String title, String author) {
		this.itemId = itemId;
		this.title = title;
		this.author = author;
	}

	// Abstract method
	public abstract int getLoanDuration();

	// Concrete method
	public void getItemDetails() {
		System.out.println("Item ID: " + itemId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Available: " + isAvailable);
	}

	// Encapsulation helpers
	protected void assignBorrower(String name) {
		borrowerName = name;
		isAvailable = false;
	}

	protected void returnItem() {
		borrowerName = null;
		isAvailable = true;
	}

	protected boolean isAvailable() {
		return isAvailable;
	}
}
