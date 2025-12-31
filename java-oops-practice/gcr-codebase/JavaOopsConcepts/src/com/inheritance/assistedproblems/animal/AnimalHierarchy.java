package com.inheritance.assistedproblems.animal;

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
