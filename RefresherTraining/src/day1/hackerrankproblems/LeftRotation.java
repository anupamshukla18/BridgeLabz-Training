package day1.hackerrankproblems;

import java.util.*;

public class LeftRotation {
	public static void main(String[] args) {
		// Scanner input
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		List<Integer> a = new ArrayList<>();

		// Adding the elements in the list
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		// Rotating the array
		List<Integer> result = rotLeft(a, d);


		// Printing the list
		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));

			if (i != result.size() - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();

		sc.close();
	}
	
	public static List<Integer> rotLeft(List<Integer> a, int d) {
		List<Integer> rotatedArray = new ArrayList<>();
		
		int n = a.size();

		d %= n;
		
		for (int i = d; i < n; i++) {
			rotatedArray.add(a.get(i));
		}

		for (int i = 0; i < d; i++) {
			rotatedArray.add(a.get(i));
		}

		// Returning the result
		return rotatedArray;
	}
}
