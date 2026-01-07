package com.virtualpetcare;

import java.util.Random;

abstract class Pet implements IInteractable {
	protected String name;
	protected String type;
	protected int age;

	private int hunger; // 0 = full, 100 = very hungry
	private int energy; // 0 = tired, 100 = energetic
	private String mood;

	// Constructor with random values
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;

		Random r = new Random();
		this.hunger = r.nextInt(50);
		this.energy = r.nextInt(50) + 50;
		updateMood();
	}

	// Encapsulated state changes
	protected void increaseEnergy(int value) {
		energy = Math.min(100, energy + value);
		updateMood();
	}

	protected void decreaseEnergy(int value) {
		energy = Math.max(0, energy - value);
		updateMood();
	}

	protected void increaseHunger(int value) {
		hunger = Math.min(100, hunger + value);
		updateMood();
	}

	protected void decreaseHunger(int value) {
		hunger = Math.max(0, hunger - value);
		updateMood();
	}

	private void updateMood() {
		if (energy > 60 && hunger < 30)
			mood = "Happy";
		else if (hunger > 70)
			mood = "Hungry";
		else
			mood = "Normal";
	}

	public void showStatus() {
		System.out.println(name + " (" + type + ")");
		System.out.println("Age: " + age);
		System.out.println("Energy: " + energy);
		System.out.println("Hunger: " + hunger);
		System.out.println("Mood: " + mood);
		System.out.println();
	}

	// Polymorphic method
	abstract void makeSound();
}
