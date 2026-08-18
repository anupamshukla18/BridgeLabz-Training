package day13.classproblems.singleinheritance;

class Animal {
	void eat() {
		System.out.println("This animal eats!");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Dog barks!");
	}
}
