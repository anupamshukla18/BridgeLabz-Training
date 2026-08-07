package day6.hackerrankproblems;

import java.util.*;

public class MissingNumbers {
	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		// Frequency maps
		HashMap<Integer, Integer> arrMap = new HashMap<>();
		HashMap<Integer, Integer> brrMap = new HashMap<>();

		// Count frequencies
		for (int num : arr) {
			arrMap.put(num, arrMap.getOrDefault(num, 0) + 1);
		}

		for (int num : brr) {
			brrMap.put(num, brrMap.getOrDefault(num, 0) + 1);
		}

		List<Integer> result = new ArrayList<>();

		// Compare frequencies
		for (int num : brrMap.keySet()) {
			if (!arrMap.containsKey(num) || !arrMap.get(num).equals(brrMap.get(num))) {
				result.add(num);
			}
		}

		Collections.sort(result);

		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		List<Integer> arr = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			arr.add(sc.nextInt());
		}

		int m = sc.nextInt();
		List<Integer> brr = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			brr.add(sc.nextInt());
		}

		List<Integer> result = missingNumbers(arr, brr);

		for (int num : result) {
			System.out.print(num + " ");
		}

		sc.close();
	}
}