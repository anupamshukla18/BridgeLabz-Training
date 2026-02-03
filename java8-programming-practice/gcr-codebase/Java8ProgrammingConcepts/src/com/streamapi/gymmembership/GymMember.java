package com.streamapi.gymmembership;

import java.time.LocalDate;

public class GymMember {

	private int id;
	private String name;
	private LocalDate expiryDate;

	public GymMember(int id, String name, LocalDate expiryDate) {
		this.id = id;
		this.name = name;
		this.expiryDate = expiryDate;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	@Override
	public String toString() {
		return name + " | Expiry Date: " + expiryDate;
	}
}
