package com.geomeasuresolutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeoMeasureDriver {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<LineComparison> history = new ArrayList<>();

		int choice;

		do {
			System.out.println("\n===== GeoMeasure Solutions =====");
			System.out.println("1. Compare two lines");
			System.out.println("2. Show all previous comparisons");
			System.out.println("3. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter x1 y1 x2 y2 for Line 1: ");
				Line line1 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

				System.out.print("Enter x1 y1 x2 y2 for Line 2: ");
				Line line2 = new Line(sc.nextDouble(), sc.nextDouble(), sc.nextDouble(), sc.nextDouble());

				LineComparison comparison = new LineComparison(line1, line2);
				comparison.compareLines();
				history.add(comparison);
				break;

			case 2:
				if (history.isEmpty()) {
					System.out.println("No comparisons available.");
				} else {
					System.out.println("\n--- Comparison History ---");
					for (LineComparison lc : history) {
						lc.compareLines();
					}
				}
				break;

			case 3:
				System.out.println("Exiting application.");
				break;

			default:
				System.out.println("Invalid choice. Try again.");
			}

		} while (choice != 3);

		sc.close();
	}
}
