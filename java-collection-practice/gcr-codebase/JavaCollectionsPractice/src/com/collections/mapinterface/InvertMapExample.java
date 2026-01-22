package com.collections.mapinterface;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class InvertMapExample {
	public static void main(String[] args) {
		// Original Map<K, V>
		Map<String, Integer> inputMap = new HashMap<>();
		inputMap.put("A", 1);
		inputMap.put("B", 2);
		inputMap.put("C", 1);

		// Inverted Map<V, List<K>>
		Map<Integer, List<String>> invertedMap = new HashMap<>();

		// Invert logic (no streams)
		for (Map.Entry<String, Integer> entry : inputMap.entrySet()) {

			String key = entry.getKey();
			Integer value = entry.getValue();

			if (invertedMap.containsKey(value)) {
				invertedMap.get(value).add(key);
			} else {
				List<String> list = new ArrayList<>();
				list.add(key);
				invertedMap.put(value, list);
			}
		}

		// Output
		System.out.println(invertedMap);
	}
}
