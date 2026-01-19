package com.sortingalgorithmsscneariobasedproblems.fitnesstracker;

class FitnessTracker {
	public static void bubbleSort(User[] users) {
		int n = users.length;
		boolean swapped;

		for (int i = 0; i < n - 1; i++) {
			swapped = false;

			for (int j = 0; j < n - 1 - i; j++) {
				if (users[j].steps < users[j + 1].steps) {
					User temp = users[j];
					users[j] = users[j + 1];
					users[j + 1] = temp;
					swapped = true;
				}
			}

			// Optimization: stop if already sorted
			if (!swapped) {
				break;
			}
		}
	}
}
