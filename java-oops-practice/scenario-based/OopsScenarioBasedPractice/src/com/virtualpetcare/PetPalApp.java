package com.virtualpetcare;

import java.util.Scanner;

public class PetPalApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pet pet = null;

		System.out.println("Welcome to PetPal – Virtual Pet Care App");

		System.out.println("Choose a pet to adopt:");
		System.out.println("1. Dog");
		System.out.println("2. Cat");
		System.out.println("3. Bird");
		System.out.print("Enter choice: ");
		int petChoice = sc.nextInt();
		sc.nextLine(); // consume newline

		System.out.print("Enter pet name: ");
		String name = sc.nextLine();

		System.out.print("Enter pet age: ");
		int age = sc.nextInt();

		// Switch case for pet creation
		switch (petChoice) {
		case 1:
			pet = new Dog(name, age);
			break;
		case 2:
			pet = new Cat(name, age);
			break;
		case 3:
			pet = new Bird(name, age);
			break;
		default:
			System.out.println("Invalid choice! Exiting...");
			System.exit(0);
		}

		int choice;
		do {
			System.out.println("\n===== Pet Interaction Menu =====");
			System.out.println("1. Feed Pet");
			System.out.println("2. Play with Pet");
			System.out.println("3. Put Pet to Sleep");
			System.out.println("4. Make Sound");
			System.out.println("5. Show Pet Status");
			System.out.println("0. Exit");
			System.out.print("Enter choice: ");
			choice = sc.nextInt();

			// Switch case for actions
			switch (choice) {
			case 1:
				pet.feed();
				System.out.println("You fed your pet");
				break;

			case 2:
				pet.play();
				System.out.println("You played with your pet");
				break;

			case 3:
				pet.sleep();
				System.out.println("Your pet is sleeping");
				break;

			case 4:
				pet.makeSound();
				break;

			case 5:
				pet.showStatus();
				break;

			case 0:
				System.out.println("Thank you for using PetPal");
				break;

			default:
				System.out.println("Invalid option! Try again");
			}

		} while (choice != 0);
		sc.close();
	}
}
