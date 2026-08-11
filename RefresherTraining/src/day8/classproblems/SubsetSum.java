package day8.classproblems;

import java.util.*;

public class SubsetSum {
	static boolean solve(int[] arr, int index, int sum, int target) {
		// All elements considered
		if (index == arr.length) {
			return sum == target;
		}

		// Include current element
		if (solve(arr, index + 1, sum + arr[index], target)) {
			return true;
		}

		// Exclude current element
		if (solve(arr, index + 1, sum, target)) {
			return true;
		}

		return false;
	}

	public static boolean subsetSum(int[] arr, int target) {
		return solve(arr, 0, 0, target);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int[] arr = new int[n];

		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int target = sc.nextInt();

		boolean result = subsetSum(arr, target);

		System.out.println(result);

		sc.close();
	}
}