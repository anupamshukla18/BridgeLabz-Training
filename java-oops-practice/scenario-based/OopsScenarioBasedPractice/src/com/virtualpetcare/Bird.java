package com.virtualpetcare;

class Bird extends Pet {
	public Bird(String name, int age) {
		super(name, "Bird", age);
	}

	@Override
	public void feed() {
		decreaseHunger(20);
	}

	@Override
	public void play() {
		decreaseEnergy(10);
		increaseHunger(10);
	}

	@Override
	public void sleep() {
		increaseEnergy(30);
	}

	@Override
	void makeSound() {
		System.out.println(name + " says: Chirp!");
	}
}
