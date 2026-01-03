package com.oopspillars.hospitalmanagementsystem;

public class InPatient extends Patient {
	private int numberOfDays;
	private double dailyCharge;

	public InPatient(int id, String name, int age, String diagnosis, int numberOfDays, double dailyCharge) {
		super(id, name, age, diagnosis);
		this.numberOfDays = numberOfDays;
		this.dailyCharge = dailyCharge;
	}

	@Override
	public double calculateBill() {
		return numberOfDays * dailyCharge;
	}
}
