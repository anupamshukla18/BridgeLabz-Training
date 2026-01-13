package com.gamebox;

// Strategy game type
class StrategyGame extends Game {

	StrategyGame(String title, double price, double rating) {
		super(title, "Strategy", price, rating);
	}

	public void playDemo() {
		System.out.println("Playing tactical strategy demo of " + title);
	}
}
