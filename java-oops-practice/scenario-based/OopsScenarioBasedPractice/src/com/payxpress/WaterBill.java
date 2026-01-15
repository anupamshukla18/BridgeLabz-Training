package com.payxpress;

import java.time.LocalDate;

//Child class for water bill
public class WaterBill extends Bill {

	// Constructor
	public WaterBill(double amount, LocalDate dueDate) {
		super("Water", amount, dueDate);
	}

	// Sends water bill reminder
	@Override
	public void sendReminder() {
		System.out.println("Water bill must be paid before " + dueDate);
	}
}
