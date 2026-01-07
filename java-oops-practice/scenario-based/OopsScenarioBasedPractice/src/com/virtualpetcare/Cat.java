package com.virtualpetcare;

class Cat extends Pet {
	public Cat(String name, int age) {
		super(name, "Cat", age);
	}

	@Override
	public void feed() {
		decreaseHunger(25);
	}

	@Override
	public void play() {
		decreaseEnergy(15);
		increaseHunger(15);
	}

	@Override
	public void sleep() {
		increaseEnergy(50);
	}

	@Override
	void makeSound() {
		System.out.println(name + " says: Meow!");
	}
}
