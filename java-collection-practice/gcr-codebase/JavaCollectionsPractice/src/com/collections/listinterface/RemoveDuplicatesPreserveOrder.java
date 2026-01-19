package com.collections.listinterface;

import java.util.*;

public class RemoveDuplicatesPreserveOrder {
	public static List<Integer> removeDuplicates(List<Integer> input) {
		Set<Integer> seen = new HashSet<>();
		List<Integer> result = new ArrayList<>();

		for (Integer num : input) {
			if (seen.add(num)) { // add() returns false if already present
				result.add(num);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		List<Integer> input = Arrays.asList(3, 1, 2, 2, 3, 4);
		System.out.println(removeDuplicates(input));
	}
}
