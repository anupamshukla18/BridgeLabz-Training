package com.personalfitnesstracker;

public class CardioWorkout extends Workout {
    public CardioWorkout(int duration) {
        super("Cardio", duration);
    }

    // Polymorphism: different calorie logic
    @Override
    public void calculateCalories() {
        caloriesBurned = duration * 8; // operator usage
    }
}
