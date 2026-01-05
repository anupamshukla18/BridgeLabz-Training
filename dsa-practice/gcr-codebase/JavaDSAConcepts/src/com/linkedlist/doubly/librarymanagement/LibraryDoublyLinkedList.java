package com.linkedlist.doubly.librarymanagement;

class LibraryDoublyLinkedList {
	private BookNode head;
	private BookNode tail;

	// Add at beginning
	public void addAtBeginning(int id, String title, String author, String genre, boolean available) {
		BookNode newNode = new BookNode(id, title, author, genre, available);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		System.out.println("Book added at beginning.");
	}

	// Add at end
	public void addAtEnd(int id, String title, String author, String genre, boolean available) {
		BookNode newNode = new BookNode(id, title, author, genre, available);

		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		System.out.println("Book added at end.");
	}

	// Add at specific position
	public void addAtPosition(int pos, int id, String title, String author, String genre, boolean available) {
		if (pos <= 0) {
			System.out.println("Invalid position.");
			return;
		}

		if (pos == 1) {
			addAtBeginning(id, title, author, genre, available);
			return;
		}

		BookNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null || temp.next == null) {
			addAtEnd(id, title, author, genre, available);
			return;
		}

		BookNode newNode = new BookNode(id, title, author, genre, available);
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;

		System.out.println("Book added at position " + pos);
	}

	// Remove by Book ID
	public void removeById(int id) {
		if (head == null) {
			System.out.println("Library is empty.");
			return;
		}

		BookNode temp = head;
		while (temp != null && temp.bookId != id) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Book not found.");
			return;
		}

		if (temp == head) {
			head = head.next;
			if (head != null)
				head.prev = null;
			else
				tail = null;
		} else if (temp == tail) {
			tail = tail.prev;
			tail.next = null;
		} else {
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
		}

		System.out.println("Book removed successfully.");
	}

	// Search by title
	public void searchByTitle(String title) {
		BookNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found)
			System.out.println("Book not found.");
	}

	// Search by author
	public void searchByAuthor(String author) {
		BookNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.author.equalsIgnoreCase(author)) {
				displayBook(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found)
			System.out.println("Book not found.");
	}

	// Update availability
	public void updateAvailability(int id, boolean status) {
		BookNode temp = head;

		while (temp != null) {
			if (temp.bookId == id) {
				temp.isAvailable = status;
				System.out.println("Availability updated.");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Book not found.");
	}

	// Display forward
	public void displayForward() {
		if (head == null) {
			System.out.println("No books to display.");
			return;
		}

		BookNode temp = head;
		System.out.println("\n--- Library Books (Forward) ---");
		while (temp != null) {
			displayBook(temp);
			temp = temp.next;
		}
	}

	// Display reverse
	public void displayReverse() {
		if (tail == null) {
			System.out.println("No books to display.");
			return;
		}

		BookNode temp = tail;
		System.out.println("\n--- Library Books (Reverse) ---");
		while (temp != null) {
			displayBook(temp);
			temp = temp.prev;
		}
	}

	// Count books
	public void countBooks() {
		int count = 0;
		BookNode temp = head;

		while (temp != null) {
			count++;
			temp = temp.next;
		}

		System.out.println("Total books in library: " + count);
	}

	private void displayBook(BookNode b) {
		System.out.println("ID: " + b.bookId + ", Title: " + b.title + ", Author: " + b.author + ", Genre: " + b.genre
				+ ", Available: " + (b.isAvailable ? "Yes" : "No"));
	}
}
