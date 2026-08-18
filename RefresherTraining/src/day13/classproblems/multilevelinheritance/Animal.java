package day13.classproblems.multilevelinheritance;

public class Animal {
	void eat() {
		System.out.println("This animal eats!!");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("The dog barks!!");
	}
}
class Puppy extends Dog {
	void play() {
		System.out.println("The puppy play");
	}
}