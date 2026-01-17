package com.sortingalgorithmsscneariobasedproblems.cropmonitor;

public class CropMonitorSorter {

	// partition logic
	public int partition(SensorData[] arr, int low, int high) {

		long pivot = arr[high].getTimestamp();
		int i = low - 1;

		for (int j = low; j < high; j++) {
			if (arr[j].getTimestamp() < pivot) {
				i++;

				// swap
				SensorData temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		i++;
		SensorData temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;

		return i;
	}

	// quick sort
	public void quickSort(SensorData[] arr, int low, int high) {

		if (low < high) {
			int pidx = partition(arr, low, high);

			quickSort(arr, low, pidx - 1);
			quickSort(arr, pidx + 1, high);
		}
	}

	// display sensor data
	public void display(SensorData[] arr) {
		for (SensorData s : arr) {
			System.out.println(s);
		}
	}
}
