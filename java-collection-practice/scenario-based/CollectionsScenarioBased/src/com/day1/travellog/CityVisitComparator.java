package com.day1.travellog;

import java.util.Comparator;
import java.util.Map;

public class CityVisitComparator implements Comparator<Map.Entry<String, Integer>> {

	@Override
	public int compare(Map.Entry<String, Integer> e1, Map.Entry<String, Integer> e2) {
		return e2.getValue() - e1.getValue(); // descending order
	}
}