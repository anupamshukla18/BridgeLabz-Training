package com.sortingalgorithmsscneariobasedproblems.examcell;

public class ExamCell {

	// Merge Sort entry
	public static void sortStudents(Student[] students) {
		mergeSort(students, 0, students.length - 1);
	}

	// Merge Sort logic
	private static void mergeSort(Student[] arr, int left, int right) {
		if (left < right) {
			int mid = (left + right) / 2;

			mergeSort(arr, left, mid);
			mergeSort(arr, mid + 1, right);

			merge(arr, left, mid, right);
		}
	}

	// Merge two sorted halves (Descending by score)
	private static void merge(Student[] arr, int left, int mid, int right) {
		int n1 = mid - left + 1;
		int n2 = right - mid;

		Student[] L = new Student[n1];
		Student[] R = new Student[n2];

		for (int i = 0; i < n1; i++)
			L[i] = arr[left + i];

		for (int j = 0; j < n2; j++)
			R[j] = arr[mid + 1 + j];

		int i = 0, j = 0, k = left;

		while (i < n1 && j < n2) {
			if (L[i].getScore() >= R[j].getScore()) {
				arr[k++] = L[i++];
			} else {
				arr[k++] = R[j++];
			}
		}

		while (i < n1)
			arr[k++] = L[i++];

		while (j < n2)
			arr[k++] = R[j++];
	}

	// Display rank list
	public static void displayRanks(Student[] students) {
		System.out.println("\nState-Level Rank List:");
		for (int i = 0; i < students.length; i++) {
			System.out.println("Rank " + (i + 1) + " : " + students[i].getScore());
		}
	}
}
