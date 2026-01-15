package com.birdsanctuary;

// Base class for all birds
@DeveloperInfo(developerName = "EcoWing Team", version = "1.0")
public abstract class Bird {

	// Common properties
	private String name;
	private String species;
	private String id;

	// Constructor
	public Bird(String name, String species, String id) {
		this.name = name;
		this.species = species;
		this.id = id;
	}

	// Common behavior
	public void eat() {
		System.out.println(name + " is eating.");
	}

	// Getter methods
	public String getName() {
		return name;
	}

	public String getSpecies() {
		return species;
	}

	public String getId() {
		return id;
	}

	// Display bird details
	public void displayInfo() {
		System.out.println("ID: " + id + ", Name: " + name + ", Species: " + species);
	}
}
