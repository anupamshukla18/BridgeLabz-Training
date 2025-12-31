package com.inheritance.assistedproblems;

//Superclass representing a generic Animal
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

// Dog subclass
class Dog extends Animal {
	Dog(String name, int age) {
		super(name, age); // calling parent constructor
	}

	// overriding makeSound() method
	void makeSound() {
		System.out.println(name + " barks: Woof Woof!");
	}
}

// Cat subclass
class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}

	// overriding makeSound() method
	void makeSound() {
		System.out.println(name + " meows: Meow Meow!");
	}
}

// Bird subclass
class Bird extends Animal {
	Bird(String name, int age) {
		super(name, age);
	}

	// overriding makeSound() method
	void makeSound() {
		System.out.println(name + " chirps: Tweet Tweet!");
	}
}

// Main class to test inheritance and polymorphism
public class AnimalHierarchy {
	public static void main(String[] args) {

		// Polymorphism: Parent reference → Child object
		Animal dog = new Dog("Tommy", 3);
		Animal cat = new Cat("Kitty", 2);
		Animal bird = new Bird("Mithu", 1);

		// calling overridden methods
		dog.makeSound();
		cat.makeSound();
		bird.makeSound(); 
	}
}
