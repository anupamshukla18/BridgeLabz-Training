package com.sortingalgorithmsscneariobasedproblems.cropmonitor;

public class CropMonitorApp {

	public static void main(String[] args) {

		SensorData[] data = { new SensorData(1700012345L, 28.5), new SensorData(1700001111L, 30.2),
				new SensorData(1700023456L, 27.8), new SensorData(1700005555L, 29.1),
				new SensorData(1700019999L, 26.4) };

		CropMonitorSorter sorter = new CropMonitorSorter();

		System.out.println("Before Sorting:");
		sorter.display(data);

		sorter.quickSort(data, 0, data.length - 1);

		System.out.println("\nAfter Sorting by Timestamp:");
		sorter.display(data);
	}
}
