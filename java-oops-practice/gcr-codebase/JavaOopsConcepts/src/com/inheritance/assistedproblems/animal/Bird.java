package com.inheritance.assistedproblems.animal;


class Bird extends Animal {
	Bird(String name, int age) {
		super(name, age);
	}

	// overriding makeSound() method
	void makeSound() {
		System.out.println(name + " chirps: Tweet Tweet!");
	}
}