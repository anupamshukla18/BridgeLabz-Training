package day12.hackerrankproblems.librarybooktracker;

public class DriverClass {
	public static void main(String[] args) {
		// Books
		Book b1 = new Book("Java Programming", "James Gosling", 101);
		b1.checkOut();
		Book b2 = new Book("Atomic Habits", "James Clear", 102);
		b1.checkOut();
		Book b3 = new Book("Alchemist", "Paulo Coelho", 103);
		b1.returnBook();
		Book b4 = new Book("Python Programming", "Guido van Rossum", 104);
		b1.checkOut();
		Book b5 = new Book("C# Programming", "Dennis Ritchie", 105);

		// Returning the result
		System.out.println("Total Books in Library: " + Book.totalBooksInLibrary);
		System.out.println("Total Books Checked Out: " + Book.totalBooksCheckedOut);
	}
}
