package com.foreachmethod.iotsensorreading;

import java.util.*;

public class SensorService {

	public void printReadingsAboveThreshold(List<Double> readings, double threshold) {

		readings.stream().filter(reading -> reading > threshold)
				.forEach(reading -> System.out.println("Alert! High Reading: " + reading));
	}
}
