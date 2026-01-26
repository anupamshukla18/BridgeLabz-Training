package com.day1.travellog;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TravelAnalyzer {

	// Find trips longer than 5 days
	public static List<Trip> getLongTrips(List<Trip> trips) {

		List<Trip> longTrips = new ArrayList<>();

		for (Trip trip : trips) {
			if (trip.getDurationInDays() > 5) {
				longTrips.add(trip);
			}
		}
		return longTrips;
	}

	// Extract unique countries
	public static Set<String> getUniqueCountries(List<Trip> trips) {

		Set<String> countries = new HashSet<>();

		for (Trip trip : trips) {
			countries.add(trip.getCountry());
		}
		return countries;
	}

	// Extract cities using regex from notes
	public static Set<String> extractCitiesFromNotes(List<Trip> trips) {

		Set<String> cities = new HashSet<>();
		Pattern pattern = Pattern.compile("\\b[A-Z][a-z]+\\b");

		for (Trip trip : trips) {
			Matcher matcher = pattern.matcher(trip.getNotes());
			while (matcher.find()) {
				cities.add(matcher.group());
			}
		}
		return cities;
	}

	// Top 3 most visited cities
	public static List<Map.Entry<String, Integer>> getTopVisitedCities(List<Trip> trips) {

		Map<String, Integer> cityCountMap = new HashMap<>();

		for (Trip trip : trips) {
			cityCountMap.put(trip.getCity(), cityCountMap.getOrDefault(trip.getCity(), 0) + 1);
		}

		List<Map.Entry<String, Integer>> cityList = new ArrayList<>(cityCountMap.entrySet());

		cityList.sort(new CityVisitComparator());

		return cityList.size() > 3 ? cityList.subList(0, 3) : cityList;
	}
}