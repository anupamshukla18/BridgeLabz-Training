package com.inheritance.hybridinheritance.problem2;

public class VehicleDriver {
	public static void main(String[] args) {
		ElectricVehicle ev = new ElectricVehicle(150, "Tesla");
		PetrolVehicle pv = new PetrolVehicle(180, "Honda City");

		ev.charge();
		pv.refuel();
	}
}