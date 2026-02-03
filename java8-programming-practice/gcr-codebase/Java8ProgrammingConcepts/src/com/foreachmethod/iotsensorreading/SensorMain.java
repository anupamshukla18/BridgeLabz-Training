package com.foreachmethod.iotsensorreading;

import java.util.*;

public class SensorMain {

	public static void main(String[] args) {

		List<Double> sensorReadings = Arrays.asList(22.5, 35.8, 18.4, 42.1, 29.9, 50.3);

		double threshold = 30.0;

		SensorService service = new SensorService();

		service.printReadingsAboveThreshold(sensorReadings, threshold);
	}
}
