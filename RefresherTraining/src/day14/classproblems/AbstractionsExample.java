package day14.classproblems;
 
abstract class Vehicle {
	abstract void start();
	
	void engine() {
		System.out.println("Engine has started!!");
	}
}

class Car extends Vehicle {
	@Override
	void start() {
		System.out.println("The car is starting!!");
	}
}

class Bike extends Vehicle {
	@Override
	void start() {
		System.out.println("The bike is starting!!");
	}
}

public class AbstractionsExample {
	public static void main(String[] args) {
		Vehicle c = new Car();
		c.start();
		c.engine();
		
		Vehicle b = new Bike();
		b.start();
	}
}
