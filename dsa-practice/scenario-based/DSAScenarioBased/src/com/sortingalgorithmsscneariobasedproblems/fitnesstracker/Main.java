package com.sortingalgorithmsscneariobasedproblems.fitnesstracker;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of users: ");
		int n = sc.nextInt();

		User[] users = new User[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for User " + (i + 1));

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Steps Today: ");
			int steps = sc.nextInt();

			users[i] = new User(name, steps);
		}

		FitnessTracker.bubbleSort(users);

		System.out.println("\nDaily Step Leaderboard:");
		for (int i = 0; i < n; i++) {
			System.out.println("Rank " + (i + 1) + " → " + users[i].name + " (" + users[i].steps + " steps)");
		}

		sc.close();
	}
}
