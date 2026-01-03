package com.oopspillars.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable {
	public Book(int id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 14; // days
	}

	@Override
	public void reserveItem(String borrowerName) {
		if (isAvailable()) {
			assignBorrower(borrowerName);
			System.out.println("Book reserved successfully.");
		} else {
			System.out.println("Book is already reserved.");
		}
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}
}
