package com.sortingalgorithmsscneariobasedproblems.icecreamrush;

public class IceCreamService {
	// Bubble Sort based on sales (popularity)
	public void bubbleSort(Flavor[] flavors) {
		int n = flavors.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (flavors[j].sales > flavors[j + 1].sales) {
					Flavor temp = flavors[j];
					flavors[j] = flavors[j + 1];
					flavors[j + 1] = temp;
				}
			}
		}
	}

	public void displayFlavors(Flavor[] flavors) {
		System.out.println("\nFlavors Sorted by Popularity:");
		for (Flavor f : flavors) {
			System.out.println(f.name + " -> Sales: " + f.sales);
		}
	}
}
