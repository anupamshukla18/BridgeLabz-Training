package day11.hackerrankproblems;

import java.util.Scanner;

public class SaveHumanity {
	public static void virusIndices(String patientDNA, String virusDNA) {

		boolean foundMatch = false;

		for (int start = 0; start <= patientDNA.length() - virusDNA.length(); start++) {

			int mismatchCount = 0;

			for (int j = 0; j < virusDNA.length(); j++) {

				if (patientDNA.charAt(start + j) != virusDNA.charAt(j)) {

					mismatchCount++;
				}

				if (mismatchCount > 1) {
					break;
				}
			}

			if (mismatchCount <= 1) {

				System.out.print(start + " ");
				foundMatch = true;
			}
		}

		if (!foundMatch) {
			System.out.print("No Match!");
		}

		System.out.println();
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int numberOfTestCases = scanner.nextInt();

		for (int i = 0; i < numberOfTestCases; i++) {

			String patientDNA = scanner.next();
			String virusDNA = scanner.next();

			virusIndices(patientDNA, virusDNA);
		}

		scanner.close();
	}
}