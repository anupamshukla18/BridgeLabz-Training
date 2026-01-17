package com.sortingalgorithmsscneariobasedproblems.artexpo;

public class ArtExpoService {

	Artist[] artists = new Artist[100];
	int count = 0;

	// Insert artist and keep list sorted using Insertion Sort
	public void addArtist(Artist artist) {
		artists[count++] = artist;
		insertionSort();
	}

	private void insertionSort() {
		for (int i = 1; i < count; i++) {
			Artist key = artists[i];
			int j = i - 1;

			while (j >= 0 && artists[j].registrationTime > key.registrationTime) {
				artists[j + 1] = artists[j];
				j--;
			}
			artists[j + 1] = key;
		}
	}

	public void displayArtists() {
		if (count == 0) {
			System.out.println("No artists registered.");
			return;
		}

		System.out.println("\nArtists Sorted by Registration Time:");
		for (int i = 0; i < count; i++) {
			System.out.println(artists[i].name + " -> Time: " + artists[i].registrationTime);
		}
	}
}
