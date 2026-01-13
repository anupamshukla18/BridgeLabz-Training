package com.gamebox;

// Arcade game type
class ArcadeGame extends Game {

	ArcadeGame(String title, double price, double rating) {
		super(title, "Arcade", price, rating);
	}

	public void playDemo() {
		System.out.println("Playing fast-paced arcade demo of " + title);
	}
}
