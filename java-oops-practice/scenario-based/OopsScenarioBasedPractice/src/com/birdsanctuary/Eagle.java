package com.birdsanctuary;

// Eagle is a bird that can fly
public class Eagle extends Bird implements Flyable {

	public Eagle(String name, String id) {
		super(name, "Eagle", id);
	}

	// Flying behavior
	public void fly() {
		System.out.println(getName() + " flies high in the sky.");
	}
}
