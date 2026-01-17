package com.sortingalgorithmsscneariobasedproblems.cropmonitor;

public class SensorData {

	private long timestamp; // epoch time or increasing time value
	private double temperature;

	public SensorData(long timestamp, double temperature) {
		this.timestamp = timestamp;
		this.temperature = temperature;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public double getTemperature() {
		return temperature;
	}

	@Override
	public String toString() {
		return "Time: " + timestamp + ", Temp: " + temperature;
	}
}
