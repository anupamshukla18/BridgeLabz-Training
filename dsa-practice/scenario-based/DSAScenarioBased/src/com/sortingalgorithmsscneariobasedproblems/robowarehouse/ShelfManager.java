package com.sortingalgorithmsscneariobasedproblems.robowarehouse;

public class ShelfManager {

	// insert package into sorted shelf using insertion sort logic
	public void insertPackage(PackageItem[] shelf, int size) {

		PackageItem key = shelf[size - 1];
		int j = size - 2;

		// shift heavier packages to the right
		while (j >= 0 && shelf[j].getWeight() > key.getWeight()) {
			shelf[j + 1] = shelf[j];
			j--;
		}

		// insert package at correct position
		shelf[j + 1] = key;
	}

	// display shelf
	public void displayShelf(PackageItem[] shelf, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(shelf[i]);
		}
	}
}
