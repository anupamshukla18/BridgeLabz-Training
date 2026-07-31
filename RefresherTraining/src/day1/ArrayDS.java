package day1;

import java.util.*;

class ReverseArrayResult {

	/*
	 * Complete the 'reverseArray' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * INTEGER_ARRAY a as parameter.
	 */

	public static List<Integer> reverseArray(List<Integer> a) {
		// Write your code here
		int left = 0;
		int right = a.size() - 1;

		while (left < right) {
			int temp = a.get(left);
			a.set(left, a.get(right));
			a.set(right, temp);
			left++;
			right--;
		}
		return a;
	}

}

public class ArrayDS {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int arrCount = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < arrCount; i++) {
			arr.add(sc.nextInt());
		}

		// Reverse the array
		List<Integer> res = ReverseArrayResult.reverseArray(arr);

		// Print the reversed array
		for (int i = 0; i < res.size(); i++) {
			System.out.print(res.get(i));

			if (i != res.size() - 1) {
				System.out.print(" ");
			}
		}

		System.out.println();

		sc.close();
	}
}
