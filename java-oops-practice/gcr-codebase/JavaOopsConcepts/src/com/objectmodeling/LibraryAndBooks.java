package com.objectmodeling;

import java.util.ArrayList;

class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public void displayBook() {
		System.out.println("Title: " + title + ", Author: " + author);
	}
}

class Library {
	private String name;
	private ArrayList<Book> books;

	public Library(String name) {
		this.name = name;
		books = new ArrayList<>();
	}

	// Adding Book to Library
	public void addBook(Book book) {
		books.add(book);
	}

	public void showLibraryBooks() {
		System.out.println("\nLibrary: " + name);
		System.out.println("Books available:");
		for (Book b : books) {
			b.displayBook();
		}
	}
}

public class LibraryAndBooks {
	public static void main(String[] args) {

		// Books exist independently
		Book b1 = new Book("System Design", "Vikash Prajapati");
		Book b2 = new Book("MySQL", "Anuj Dwivedi");
		Book b3 = new Book("DBMS", "Vishal Yadav");

		// Libraries
		Library cityLibrary = new Library("City Library");
		Library collegeLibrary = new Library("College Library");

		// Adding same OR different books to different libraries
		cityLibrary.addBook(b1);
		cityLibrary.addBook(b2);

		collegeLibrary.addBook(b2); // same book in another library
		collegeLibrary.addBook(b3);

		// Display
		cityLibrary.showLibraryBooks();
		collegeLibrary.showLibraryBooks();
	}
}
