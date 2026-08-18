package day13.classproblems.hierarchicalinheritance;

public class DriverClass {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.eat();
		c.meow();
		Dog d = new Dog();
		d.eat();
		d.bark();
	}
}
