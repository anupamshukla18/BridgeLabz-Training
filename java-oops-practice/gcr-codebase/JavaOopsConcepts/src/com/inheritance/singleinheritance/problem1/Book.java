package com.inheritance.singleinheritance.problem1;

class Book {
	// instance variables
	String title;
	int publicationYear;

	// constructor
	Book(String title, int publicationYear) {
		this.title = title;
		this.publicationYear = publicationYear;
	}

	// display function
	void displayInfo() {
		System.out.println("Book Title: " + title);
		System.out.println("Publication Year: " + publicationYear);
	}
}