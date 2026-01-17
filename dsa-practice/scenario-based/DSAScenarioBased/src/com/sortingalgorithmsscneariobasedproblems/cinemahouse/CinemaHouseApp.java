package com.sortingalgorithmsscneariobasedproblems.cinemahouse;

public class CinemaHouseApp {

	public static void main(String[] args) {

		MovieShow[] shows = { new MovieShow("Avatar", 1830), new MovieShow("Inception", 1500),
				new MovieShow("Interstellar", 2100), new MovieShow("Joker", 1200), new MovieShow("Titanic", 1700) };

		CinemaHouseManager manager = new CinemaHouseManager();

		System.out.println("Before Sorting:");
		manager.displayShows(shows);

		manager.bubbleSort(shows);

		System.out.println("\nAfter Sorting by Show Time:");
		manager.displayShows(shows);
	}
}
