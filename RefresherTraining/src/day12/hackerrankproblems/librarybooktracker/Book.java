package day12.hackerrankproblems.librarybooktracker;

public class Book {
	// static variables
	static int totalBooksInLibrary = 0;
	static int totalBooksCheckedOut = 0;
	
	// Instance variables
	String title;
	String author;
	int isbn;

	public Book(String title, String author, int isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;

		// Counting the total number of books
		totalBooksInLibrary++;
	}

	// Increasing the count of checked out books
	public void checkOut() {
		totalBooksCheckedOut++;
	}

	// Decreasing the count of checked out books
	public void returnBook() {
		totalBooksCheckedOut--;
	}
}
