package com.oopspillars.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable {
	public Magazine(int id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 7; // days
	}

	@Override
	public void reserveItem(String borrowerName) {
		if (isAvailable()) {
			assignBorrower(borrowerName);
			System.out.println("Magazine reserved successfully.");
		} else {
			System.out.println("Magazine is already reserved.");
		}
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}
}
