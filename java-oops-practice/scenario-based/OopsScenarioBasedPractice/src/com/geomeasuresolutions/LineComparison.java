package com.geomeasuresolutions;

public class LineComparison {
	private Line line1;
	private Line line2;

	// Constructor
	public LineComparison(Line line1, Line line2) {
		this.line1 = line1;
		this.line2 = line2;
	}

	// Compare two lines
	public void compareLines() {
		double length1 = line1.getLength();
		double length2 = line2.getLength();

		System.out.printf("Line 1 Length: %.2f%n", length1);
		System.out.printf("Line 2 Length: %.2f%n", length2);

		if (Double.compare(length1, length2) == 0) {
			System.out.println("Result: Both lines are equal in length.");
		} else if (length1 > length2) {
			System.out.println("Result: Line 1 is longer.");
		} else {
			System.out.println("Result: Line 2 is longer.");
		}

		System.out.println("----------------------------------");
	}
}
