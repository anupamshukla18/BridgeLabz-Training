package com.personalfitnesstracker;

public abstract class Workout implements ITrackable {
	protected String type;
	protected int duration; // minutes
	protected int caloriesBurned;

	protected boolean isActive;

	public Workout(String type, int duration) {
		this.type = type;
		this.duration = duration;
	}

	// Polymorphic method
	public abstract void calculateCalories();

	@Override
	public void startWorkout() {
		isActive = true;
		System.out.println(type + " workout started.");
	}

	@Override
	public void stopWorkout() {
		isActive = false;
		System.out.println(type + " workout stopped.");
	}

	public int getCaloriesBurned() {
		return caloriesBurned;
	}
}
