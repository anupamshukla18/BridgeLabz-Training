package com.inheritance.assistedproblems.animal;

class Cat extends Animal {
	Cat(String name, int age) {
		super(name, age);
	}

	// overriding makeSound() method
	void makeSound() {
		System.out.println(name + " meows: Meow Meow!");
	}
}
