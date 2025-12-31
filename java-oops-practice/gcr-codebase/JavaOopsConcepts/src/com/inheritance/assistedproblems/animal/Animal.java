package com.inheritance.assistedproblems.animal;

class Animal {
	String name;
	int age;

	// Constructor to initialize common properties
	Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Method to be overridden by subclasses
	void makeSound() {
		System.out.println("Animal makes a sound");
	}
}
