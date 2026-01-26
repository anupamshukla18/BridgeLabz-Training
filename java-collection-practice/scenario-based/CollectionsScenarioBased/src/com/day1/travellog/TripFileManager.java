package com.day1.travellog;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TripFileManager {

	public static void writeTrips(List<Trip> trips, String filePath) {

		try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {

			out.writeObject(trips);

		} catch (IOException e) {
			System.out.println("Error writing trips to file");
		}
	}

	@SuppressWarnings("unchecked")
	public static List<Trip> readTrips(String filePath) {

		List<Trip> trips = new ArrayList<>();

		try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {

			trips = (List<Trip>) in.readObject();

		} catch (Exception e) {
			System.out.println("Error reading trips from file");
		}

		return trips;
	}
}