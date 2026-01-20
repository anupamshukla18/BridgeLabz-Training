package com.collections.setinterface;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifference {
	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<>();
		set1.add(1);
		set1.add(2);
		set1.add(3);

		Set<Integer> set2 = new HashSet<>();
		set2.add(3);
		set2.add(4);
		set2.add(5);

		Set<Integer> result = symmetricDifference(set1, set2);
		System.out.println(result); // Output: [1, 2, 4, 5]
	}

	public static Set<Integer> symmetricDifference(Set<Integer> a, Set<Integer> b) {
		Set<Integer> result = new HashSet<>(a);
		result.addAll(b); // Union of both sets

		Set<Integer> intersection = new HashSet<>(a);
		intersection.retainAll(b); // Common elements

		result.removeAll(intersection); // Remove common elements
		return result;
	}
}
