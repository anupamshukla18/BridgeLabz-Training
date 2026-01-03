package com.oopspillars.librarymanagementsystem;

public interface Reservable {
	// for reserving an item
	void reserveItem(String borrowerName);

	// checking availability
	boolean checkAvailability();
}
