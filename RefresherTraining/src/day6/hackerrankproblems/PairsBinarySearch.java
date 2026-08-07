package day6.hackerrankproblems;

import java.util.*;

public class PairsBinarySearch {
	public static int pairs(int k, List<Integer> arr) {
		// Sort the array
		Collections.sort(arr);

		int count = 0;

		// Search for (arr[i] + k)
		for (int i = 0; i < arr.size(); i++) {

			int target = arr.get(i) + k;

			if (binarySearch(arr, i + 1, arr.size() - 1, target)) {
				count++;
			}
		}

		return count;
	}

	// Binary Search
	public static boolean binarySearch(List<Integer> arr, int low, int high, int target) {

		while (low <= high) {

			int mid = low + (high - low) / 2;

			if (arr.get(mid) == target) {
				return true;
			} else if (arr.get(mid) < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int k = sc.nextInt();

		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		System.out.println(pairs(k, arr));

		sc.close();
	}
}