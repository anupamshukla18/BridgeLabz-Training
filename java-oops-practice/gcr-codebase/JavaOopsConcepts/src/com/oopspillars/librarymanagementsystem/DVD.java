package com.oopspillars.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable {
	public DVD(int id, String title, String author) {
		super(id, title, author);
	}

	@Override
	public int getLoanDuration() {
		return 3; // days
	}

	@Override
	public void reserveItem(String borrowerName) {
		if (isAvailable()) {
			assignBorrower(borrowerName);
			System.out.println("DVD reserved successfully.");
		} else {
			System.out.println("DVD is already reserved.");
		}
	}

	@Override
	public boolean checkAvailability() {
		return isAvailable();
	}
}
