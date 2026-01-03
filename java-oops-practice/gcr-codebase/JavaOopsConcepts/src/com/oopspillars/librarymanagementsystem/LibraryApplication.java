package com.oopspillars.librarymanagementsystem;

import java.util.*;

public class LibraryApplication {
	public static void main(String[] args) {
		// Polymorphic list
		List<LibraryItem> items = new ArrayList<>();

		items.add(new Book(101, "Clean Code", "Robert Martin"));
		items.add(new Magazine(202, "Java Monthly", "Oracle"));
		items.add(new DVD(303, "Inception", "Christopher Nolan"));

		for (LibraryItem item : items) {

			item.getItemDetails();
			System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

			// Interface usage
			if (item instanceof Reservable) {
				Reservable r = (Reservable) item;

				if (r.checkAvailability()) {
					r.reserveItem("Anupam");
				}
			}

			System.out.println("--------------------------------");
		}
	}
}
