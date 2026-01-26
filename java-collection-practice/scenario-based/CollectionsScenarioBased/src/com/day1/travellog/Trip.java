package com.day1.travellog;

import java.io.Serializable;

public class Trip implements Serializable {

	private static final long serialVersionUID = 1L;

	private String city;
	private String country;
	private int durationInDays;
	private String notes;

	public Trip(String city, String country, int durationInDays, String notes) {
		this.city = city;
		this.country = country;
		this.durationInDays = durationInDays;
		this.notes = notes;
	}

	public String getCity() {
		return city;
	}

	public String getCountry() {
		return country;
	}

	public int getDurationInDays() {
		return durationInDays;
	}

	public String getNotes() {
		return notes;
	}

	@Override
	public String toString() {
		return city + ", " + country + " (" + durationInDays + " days)";
	}
}