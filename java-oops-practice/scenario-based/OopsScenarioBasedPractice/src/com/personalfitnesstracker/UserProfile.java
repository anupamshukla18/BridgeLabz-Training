package com.personalfitnesstracker;

public class UserProfile {
	private String name;
	private int age;

	// Protected health data
	private double weight; // encapsulated
	private int dailyGoal; // calories target

	// Constructor with default goal
	public UserProfile(String name, int age, double weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyGoal = 500; // default calorie goal
	}

	// Constructor with custom goal
	public UserProfile(String name, int age, double weight, int dailyGoal) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.dailyGoal = dailyGoal;
	}

	public int getDailyGoal() {
		return dailyGoal;
	}

	// Health data not directly modifiable
	public double getWeight() {
		return weight;
	}

	public void showProfile() {
		System.out.println("Name  : " + name);
		System.out.println("Age   : " + age);
		System.out.println("Goal  : " + dailyGoal + " calories/day");
	}
}
