package com.collections.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MaxValueKeyFinder {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 15);

		String maxKey = null;
		int maxValue = Integer.MIN_VALUE;

		// Traverse map (no streams)
		for (Map.Entry<String, Integer> entry : map.entrySet()) {

			if (entry.getValue() > maxValue) {
				maxValue = entry.getValue();
				maxKey = entry.getKey();
			}
		}

		// Output
		System.out.println(maxKey);
	}
}
