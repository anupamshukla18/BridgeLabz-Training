package com.gamebox;

// Base class for all games
abstract class Game implements IDownloadable {
	protected String title;
	protected String genre;
	protected double price;
	protected double rating;

	// Constructor for paid game
	Game(String title, String genre, double price, double rating) {
		this.title = title;
		this.genre = genre;
		this.price = price;
		this.rating = rating;
	}

	// Constructor for free game
	Game(String title, String genre) {
		this(title, genre, 0.0, 0.0);
	}

	// Apply seasonal offer (operator usage)
	void applyDiscount(double percent) {
		price = price - (price * percent / 100);
	}

	// Common download
	public void download() {
		System.out.println(title + " downloaded successfully.");
	}

	// Polymorphic method
	public abstract void playDemo();
}
