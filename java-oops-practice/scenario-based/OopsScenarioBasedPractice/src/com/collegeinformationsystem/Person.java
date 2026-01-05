package com.collegeinformationsystem;

//Base class
abstract class Person {
	protected int id;
	protected String name;
	protected String email;

	// Constructor
	public Person(int id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	// Abstract method for polymorphism
	abstract void printDetails();
}
