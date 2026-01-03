package com.oopspillars.hospitalmanagementsystem;

public class OutPatient extends Patient {
	private double consultationFee;

	public OutPatient(int id, String name, int age, String diagnosis, double consultationFee) {
		super(id, name, age, diagnosis);
		this.consultationFee = consultationFee;
	}

	@Override
	public double calculateBill() {
		return consultationFee;
	}
}
