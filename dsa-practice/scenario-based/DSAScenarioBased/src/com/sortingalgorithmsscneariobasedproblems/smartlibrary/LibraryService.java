package com.sortingalgorithmsscneariobasedproblems.smartlibrary;

public class LibraryService {
	Book[] books = new Book[50];
	int count = 0;

	// Add book and maintain alphabetical order
	public void addBook(Book book) {
		books[count++] = book;
		insertionSort();
	}

	private void insertionSort() {
		for (int i = 1; i < count; i++) {
			Book key = books[i];
			int j = i - 1;

			while (j >= 0 && books[j].title.compareToIgnoreCase(key.title) > 0) {
				books[j + 1] = books[j];
				j--;
			}
			books[j + 1] = key;
		}
	}

	public void displayBooks() {
		if (count == 0) {
			System.out.println("No books borrowed yet.");
			return;
		}

		System.out.println("\nBorrowed Books (Alphabetical Order):");
		for (int i = 0; i < count; i++) {
			System.out.println((i + 1) + ". " + books[i].title);
		}
	}
}
