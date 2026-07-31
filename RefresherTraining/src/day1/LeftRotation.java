package day1;

import java.util.*;

class Result {

	/*
	 * Complete the 'rotLeft' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER_ARRAY a 2. INTEGER d
	 */

	public static List<Integer> rotLeft(List<Integer> a, int d) {
		// Write your code here
		List<Integer> rotatedArray = new ArrayList<>();
		int n = a.size();

		d %= n;

		for (int i = d; i < n; i++) {
			rotatedArray.add(a.get(i));
		}

		for (int i = 0; i < d; i++) {
			rotatedArray.add(a.get(i));
		}

		return rotatedArray;
	}

}

public class LeftRotation {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int d = sc.nextInt();

		List<Integer> a = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}

		List<Integer> result = Result.rotLeft(a, d);

		for (int i = 0; i < result.size(); i++) {
			System.out.print(result.get(i));

			if (i != result.size() - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();

		sc.close();
	}
}
