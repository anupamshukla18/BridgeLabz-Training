package com.bookshelflibraryorganizer;

import java.util.*;

class Library {
	private HashMap<String, GenreCatalog> catalog;
	private HashSet<String> uniqueBooks;

	Library() {
		catalog = new HashMap<>();
		uniqueBooks = new HashSet<>();
	}

	private String normalize(String s) {
		return s.trim().toLowerCase();
	}

	public void addBook(String genre, String title, String author) {
		genre = normalize(genre);
		title = normalize(title);
		author = normalize(author);

		String key = title + "-" + author;

		if (uniqueBooks.contains(key)) {
			System.out.println("❌ Book already exists");
			return;
		}

		uniqueBooks.add(key);
		catalog.putIfAbsent(genre, new GenreCatalog());
		catalog.get(genre).addBook(new Book(title, author));

		System.out.println("Book added successfully");
	}

	public void borrowBook(String genre, String title) {
		genre = normalize(genre);
		title = normalize(title);

		GenreCatalog gc = catalog.get(genre);

		if (gc == null || !gc.removeBook(title)) {
			System.out.println("Book not found");
			return;
		}

		System.out.println("Book borrowed successfully");

		if (gc.isEmpty()) {
			catalog.remove(genre);
		}
	}

	public void displayLibrary() {
		System.out.println("\n===== Library Catalog =====");
		if (catalog.isEmpty()) {
			System.out.println("Library is empty");
		}

		for (String genre : catalog.keySet()) {
			System.out.println("Genre: " + genre);
			for (Book b : catalog.get(genre).getBooks()) {
				System.out.println("  - " + b);
			}
		}
		System.out.println("===========================\n");
	}
}
