package com.sortingalgorithmsscneariobasedproblems.examcell;

import java.util.Scanner;

public class ExamCellApp {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Student[] students = null;
		boolean dataEntered = false;

		while (true) {
			System.out.println("\n--- ExamCell Menu ---");
			System.out.println("1. Enter Student Scores");
			System.out.println("2. Generate Rank List (Merge Sort)");
			System.out.println("3. Exit");
			System.out.print("Enter choice: ");

			int choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter number of test centers: ");
				int centers = sc.nextInt();

				System.out.print("Enter students per center: ");
				int perCenter = sc.nextInt();

				students = new Student[centers * perCenter];
				int index = 0;

				for (int i = 1; i <= centers; i++) {
					System.out.println("Enter sorted scores for Center " + i + ":");
					for (int j = 0; j < perCenter; j++) {
						students[index++] = new Student(sc.nextInt());
					}
				}

				dataEntered = true;
				System.out.println("Scores recorded successfully.");
				break;

			case 2:
				if (!dataEntered) {
					System.out.println("Please enter scores first.");
				} else {
					ExamCell.sortStudents(students);
					ExamCell.displayRanks(students);
				}
				break;

			case 3:
				System.out.println("Exiting ExamCell System.");
				sc.close();
				return;

			default:
				System.out.println("Invalid choice.");
			}
		}
	}
}
