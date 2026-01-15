package com.birdsanctuary;

// Penguin can swim but cannot fly
public class Penguin extends Bird implements Swimmable {

	public Penguin(String name, String id) {
		super(name, "Penguin", id);
	}

	public void swim() {
		System.out.println(getName() + " swims fast.");
	}
}
