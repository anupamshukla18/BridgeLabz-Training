package com.birdsanctuary;

// Duck can both fly and swim
public class Duck extends Bird implements Flyable, Swimmable {

	public Duck(String name, String id) {
		super(name, "Duck", id);
	}

	public void fly() {
		System.out.println(getName() + " flies.");
	}

	public void swim() {
		System.out.println(getName() + " swims.");
	}
}
