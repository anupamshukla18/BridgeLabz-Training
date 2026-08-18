package day13.classproblems.hierarchicalinheritance;

public class Animal {
	void eat() {
		System.out.println("This animal eats!!");
	}
}
class Dog extends Animal  {
	void bark() {
		System.out.println("The dog barks!!");
	}
}
class Cat extends Animal {
	void meow() {
		System.out.println("The cat makes this sound!!");
	}
}