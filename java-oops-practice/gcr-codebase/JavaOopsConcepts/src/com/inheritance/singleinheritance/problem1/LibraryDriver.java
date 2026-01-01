package com.inheritance.singleinheritance.problem1;

public class LibraryDriver {
	public static void main(String[] args) {
		// making the author's object
		Author obj = new Author("Clean Code", 2008, "Robert C. Martin",
				"A well-known software engineer and author of coding best practices.");

		obj.displayInfo();
	}
}
