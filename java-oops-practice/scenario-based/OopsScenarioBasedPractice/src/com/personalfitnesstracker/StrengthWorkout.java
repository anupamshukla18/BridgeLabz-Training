package com.personalfitnesstracker;

public class StrengthWorkout extends Workout {
    public StrengthWorkout(int duration) {
        super("Strength", duration);
    }

    // Polymorphism: different calorie logic
    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 6;
    }
}
