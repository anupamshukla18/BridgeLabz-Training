package com.personalfitnesstracker;

import java.util.Scanner;

public class FitnessTrackingApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UserProfile user = null;
        Workout workout = null;
        int choice;

        do {
            System.out.println("\n===== FitTrack Menu =====");
            System.out.println("1. Create User Profile");
            System.out.println("2. Start Cardio Workout");
            System.out.println("3. Start Strength Workout");
            System.out.println("4. Stop Workout & View Progress");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();

                    System.out.print("Enter Weight: ");
                    double weight = sc.nextDouble();

                    System.out.print("Enter Daily Calorie Goal: ");
                    int goal = sc.nextInt();

                    user = new UserProfile(name, age, weight, goal);
                    System.out.println("User profile created!");
                    break;

                case 2:
                    if (user == null) {
                        System.out.println("Create user profile first!");
                        break;
                    }
                    System.out.print("Enter duration (minutes): ");
                    workout = new CardioWorkout(sc.nextInt());
                    workout.startWorkout();
                    workout.calculateCalories();
                    break;

                case 3:
                    if (user == null) {
                        System.out.println("Create user profile first!");
                        break;
                    }
                    System.out.print("Enter duration (minutes): ");
                    workout = new StrengthWorkout(sc.nextInt());
                    workout.startWorkout();
                    workout.calculateCalories();
                    break;

                case 4:
                    if (workout == null || user == null) {
                        System.out.println("No active workout!");
                        break;
                    }
                    workout.stopWorkout();

                    int burned = workout.getCaloriesBurned();
                    int remaining = user.getDailyGoal() - burned; // operator usage

                    System.out.println("Calories Burned : " + burned);
                    System.out.println("Remaining Goal  : " + remaining);
                    break;

                case 0:
                    System.out.println("Exiting FitTrack...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 0);

        sc.close();
    }
}
