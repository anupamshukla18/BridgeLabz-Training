package com.sortingalgorithmsscneariobasedproblems.eduresult;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of students: ");
		int n = sc.nextInt();

		Student[] students = new Student[n];

		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for Student " + (i + 1));

			System.out.print("Roll Number: ");
			int roll = sc.nextInt();

			System.out.print("Name: ");
			String name = sc.next();

			System.out.print("Marks: ");
			int marks = sc.nextInt();

			students[i] = new Student(roll, name, marks);
		}

		EduResults.mergeSort(students, 0, n - 1);

		System.out.println("\nFinal State-wise Rank List:");
		for (int i = 0; i < n; i++) {
			System.out.println("Rank " + (i + 1) + " → " + students[i].name + " | Marks: " + students[i].marks);
		}

		sc.close();
	}
}
