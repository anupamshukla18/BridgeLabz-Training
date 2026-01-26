package com.day1.travellog;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class TravelLogApp {

	public static void main(String[] args) {

		String filePath = "trips.dat";

		// Sample trips
		List<Trip> trips = List.of(new Trip("Paris", "France", 7, "Visited Paris and Rome"),
				new Trip("Rome", "Italy", 4, "Rome was beautiful"),
				new Trip("Delhi", "India", 10, "Delhi and Jaipur trip"),
				new Trip("Paris", "France", 6, "Another Paris visit"),
				new Trip("Delhi", "India", 3, "Short Delhi visit"));

		// Write trips to file
		TripFileManager.writeTrips(trips, filePath);

		// Read trips from file
		List<Trip> savedTrips = TripFileManager.readTrips(filePath);

		System.out.println("Trips longer than 5 days:");
		TravelAnalyzer.getLongTrips(savedTrips).forEach(System.out::println);

		System.out.println("\nUnique countries visited:");
		Set<String> countries = TravelAnalyzer.getUniqueCountries(savedTrips);
		countries.forEach(System.out::println);

		System.out.println("\nTop 3 most visited cities:");
		List<Map.Entry<String, Integer>> topCities = TravelAnalyzer.getTopVisitedCities(savedTrips);

		for (Map.Entry<String, Integer> entry : topCities) {
			System.out.println(entry.getKey() + " -> " + entry.getValue());
		}
	}
}