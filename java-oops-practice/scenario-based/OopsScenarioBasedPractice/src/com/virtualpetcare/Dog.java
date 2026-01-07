package com.virtualpetcare;

class Dog extends Pet {
	public Dog(String name, int age) {
		super(name, "Dog", age);
	}

	@Override
	public void feed() {
		decreaseHunger(30);
		increaseEnergy(10);
	}

	@Override
	public void play() {
		decreaseEnergy(20);
		increaseHunger(20);
	}

	@Override
	public void sleep() {
		increaseEnergy(40);
	}

	@Override
	void makeSound() {
		System.out.println(name + " says: Woof!");
	}
}
