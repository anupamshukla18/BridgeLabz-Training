package com.sortingalgorithmsscneariobasedproblems.cinemahouse;

public class CinemaHouseManager {

	// bubble sort for sorting movie shows by time
	public void bubbleSort(MovieShow[] shows) {

		int n = shows.length;

		for (int pass = 1; pass < n; pass++) {

			boolean swapped = false;

			for (int i = 0; i < n - pass; i++) {

				if (shows[i].getShowTime() > shows[i + 1].getShowTime()) {

					// swap adjacent shows
					MovieShow temp = shows[i];
					shows[i] = shows[i + 1];
					shows[i + 1] = temp;

					swapped = true;
				}
			}

			// already sorted
			if (!swapped) {
				break;
			}
		}
	}

	// display shows
	public void displayShows(MovieShow[] shows) {
		for (MovieShow show : shows) {
			System.out.println(show);
		}
	}
}
