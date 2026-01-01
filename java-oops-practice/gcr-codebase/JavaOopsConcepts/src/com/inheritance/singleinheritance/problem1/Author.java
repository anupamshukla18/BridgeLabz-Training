package com.inheritance.singleinheritance.problem1;

class Author extends Book {
	String name;
	String bio;

	// constructor
	Author(String title, int publicationYear, String name, String bio) {
		super(title, publicationYear); // calling Book constructor
		this.name = name;
		this.bio = bio;
	}

	// Overriding / extending functionality
	void displayInfo() {
		super.displayInfo(); // show book details
		System.out.println("Author Name: " + name);
		System.out.println("Author Bio: " + bio);
	}
}