package com.sortingalgorithmsscneariobasedproblems.hospitalqueue;

import java.util.Scanner;

public class HospitalQueue {
	// bubble sort for sorting the patients by criticality
	static void sortByCriticality(Patient[] patients) {
		int n = patients.length;

		// Bubble Sort logic
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {

				// Compare adjacent patients
				if (patients[j].criticality < patients[j + 1].criticality) {

					// Swap patients
					Patient temp = patients[j];
					patients[j] = patients[j + 1];
					patients[j + 1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Ask user for number of patients
		System.out.print("Enter number of patients: ");
		int n = sc.nextInt();
		sc.nextLine(); // clear buffer

		// Create array of patients
		Patient[] patients = new Patient[n];

		// Take patient details from user
		for (int i = 0; i < n; i++) {
			System.out.println("\nEnter details for Patient " + (i + 1));

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Criticality (1-10): ");
			int criticality = sc.nextInt();
			sc.nextLine(); // clear buffer

			patients[i] = new Patient(name, criticality);
		}

		// Display before sorting
		System.out.println("\nBefore Sorting (Arrival Order):");
		for (Patient p : patients) {
			p.display();
		}

		// Sort patients by criticality
		sortByCriticality(patients);

		// Display after sorting
		System.out.println("\nAfter Sorting (By Criticality):");
		for (Patient p : patients) {
			p.display();
		}

		sc.close();
	}
}
