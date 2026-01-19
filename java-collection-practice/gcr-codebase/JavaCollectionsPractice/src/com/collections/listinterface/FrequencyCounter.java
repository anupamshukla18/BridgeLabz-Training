package com.collections.listinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {
	public static Map<String, Integer> countFrequency(List<String> list) {
		Map<String, Integer> frequencyMap = new HashMap<>();

		for (String item : list) {
			frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
		}

		return frequencyMap;
	}

	public static void main(String[] args) {

		List<String> input = List.of("apple", "banana", "apple", "orange");

		Map<String, Integer> result = countFrequency(input);

		System.out.println(result);
	}
}
