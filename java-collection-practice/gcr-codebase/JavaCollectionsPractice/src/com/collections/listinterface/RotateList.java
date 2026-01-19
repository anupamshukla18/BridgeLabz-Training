package com.collections.listinterface;

import java.util.ArrayList;
import java.util.List;

public class RotateList {
	public static <T> List<T> rotateLeft(List<T> list, int k) {
		int n = list.size();
		if (n == 0)
			return list;

		k = k % n; // handle k > n
		List<T> rotated = new ArrayList<>();

		for (int i = k; i < n; i++) {
			rotated.add(list.get(i));
		}

		for (int i = 0; i < k; i++) {
			rotated.add(list.get(i));
		}

		return rotated;
	}

	public static void main(String[] args) {
		List<Integer> input = List.of(10, 20, 30, 40, 50);

		int rotateBy = 2;

		List<Integer> result = rotateLeft(input, rotateBy);

		System.out.println(result);
	}
}
