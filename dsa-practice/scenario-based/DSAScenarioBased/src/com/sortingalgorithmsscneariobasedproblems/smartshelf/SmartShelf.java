package com.sortingalgorithmsscneariobasedproblems.smartshelf;

import java.util.ArrayList;

// SmartShelf class
class SmartShelf {
	ArrayList<Book> books = new ArrayList<>();

	// Method to add a book
	void addBook(String title) {
		books.add(new Book(title));
		insertionSort(); // Keep list sorted after every insertion
	}

	// Insertion Sort by book title
	void insertionSort() {
		for (int i = 1; i < books.size(); i++) {
			Book key = books.get(i);
			int j = i - 1;

			// Compare titles alphabetically
			while (j >= 0 && books.get(j).title.compareToIgnoreCase(key.title) > 0) {
				books.set(j + 1, books.get(j));
				j--;
			}
			books.set(j + 1, key);
		}
	}

	// Display all books
	void displayBooks() {
		if (books.isEmpty()) {
			System.out.println("No books in the shelf.");
			return;
		}

		System.out.println("\nBooks in SmartShelf (Alphabetical Order):");
		for (Book b : books) {
			System.out.println("- " + b.title);
		}
	}
}
