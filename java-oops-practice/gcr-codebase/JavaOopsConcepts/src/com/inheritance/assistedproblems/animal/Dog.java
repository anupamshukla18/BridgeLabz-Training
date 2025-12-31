package com.inheritance.assistedproblems.animal;

class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age); // calling parent constructor
	}

	// overriding makeSound() method
	void makeSound() {
		System.out.println(name + " barks: Woof Woof!");
	}
}