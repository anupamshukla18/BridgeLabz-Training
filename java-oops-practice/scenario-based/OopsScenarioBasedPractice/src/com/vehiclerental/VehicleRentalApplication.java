package com.vehiclerental;

public class VehicleRentalApplication {
	public static void main(String[] args) {
		Customer customer = new Customer("Anupam");

		// Rentable reference
		Rentable[] vehicles = { new Bike("B101", "Yamaha", 300), new Car("C202", "Honda", 1200),
				new Truck("T303", "Tata", 2500) };

		int days = 3;

		System.out.println("Customer: " + customer.getCustomerName());
		System.out.println("Rental Days: " + days);
		System.out.println("--------------------------------");

		// rent calculation
		for (Rentable v : vehicles) {
			System.out.println("Total Rent: " + v.calculateRent(days));
		}
	}
}
