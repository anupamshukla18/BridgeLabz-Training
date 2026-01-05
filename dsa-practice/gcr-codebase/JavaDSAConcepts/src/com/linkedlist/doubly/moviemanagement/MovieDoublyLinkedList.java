package com.linkedlist.doubly.moviemanagement;

class MovieDoublyLinkedList {
	private MovieNode head;
	private MovieNode tail;

	// Add at beginning
	public void addAtBeginning(String title, String director, int year, double rating) {
		MovieNode newNode = new MovieNode(title, director, year, rating);

		if (head == null) {
			head = tail = newNode;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		System.out.println("Movie added at beginning.");
	}

	// Add at end
	public void addAtEnd(String title, String director, int year, double rating) {
		MovieNode newNode = new MovieNode(title, director, year, rating);

		if (tail == null) {
			head = tail = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		System.out.println("Movie added at end.");
	}

	// Add at specific position
	public void addAtPosition(int pos, String title, String director, int year, double rating) {
		if (pos <= 0) {
			System.out.println("Invalid position.");
			return;
		}

		if (pos == 1) {
			addAtBeginning(title, director, year, rating);
			return;
		}

		MovieNode temp = head;
		for (int i = 1; i < pos - 1 && temp != null; i++) {
			temp = temp.next;
		}

		if (temp == null || temp.next == null) {
			addAtEnd(title, director, year, rating);
			return;
		}

		MovieNode newNode = new MovieNode(title, director, year, rating);
		newNode.next = temp.next;
		newNode.prev = temp;
		temp.next.prev = newNode;
		temp.next = newNode;

		System.out.println("Movie added at position " + pos);
	}

	// Remove movie by title
	public void removeByTitle(String title) {
		if (head == null) {
			System.out.println("Movie list is empty.");
			return;
		}

		MovieNode temp = head;

		while (temp != null && !temp.title.equalsIgnoreCase(title)) {
			temp = temp.next;
		}

		if (temp == null) {
			System.out.println("Movie not found.");
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

		System.out.println("Movie removed successfully.");
	}

	// Search by director
	public void searchByDirector(String director) {
		MovieNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("No movies found for this director.");
		}
	}

	// Search by rating
	public void searchByRating(double rating) {
		MovieNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.rating == rating) {
				displayMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (!found) {
			System.out.println("No movies found with this rating.");
		}
	}

	// Update rating by title
	public void updateRating(String title, double newRating) {
		MovieNode temp = head;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Rating updated successfully.");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Movie not found.");
	}

	// Display forward
	public void displayForward() {
		if (head == null) {
			System.out.println("No movies to display.");
			return;
		}

		MovieNode temp = head;
		System.out.println("\n--- Movies (Forward) ---");
		while (temp != null) {
			displayMovie(temp);
			temp = temp.next;
		}
	}

	// Display reverse
	public void displayReverse() {
		if (tail == null) {
			System.out.println("No movies to display.");
			return;
		}

		MovieNode temp = tail;
		System.out.println("\n--- Movies (Reverse) ---");
		while (temp != null) {
			displayMovie(temp);
			temp = temp.prev;
		}
	}

	private void displayMovie(MovieNode m) {
		System.out.println(
				"Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
	}
}
