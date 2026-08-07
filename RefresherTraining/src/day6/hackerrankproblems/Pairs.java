package day6.hackerrankproblems;

import java.util.*;

public class Pairs {
	public static int pairs(int k, List<Integer> arr) {
		// Store all elements
		HashSet<Integer> set = new HashSet<>();

		for (int num : arr) {
			set.add(num);
		}

		int count = 0;

		// Check if num + k exists
		for (int num : arr) {
			if (set.contains(num + k)) {
				count++;
			}
		}

		return count;
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