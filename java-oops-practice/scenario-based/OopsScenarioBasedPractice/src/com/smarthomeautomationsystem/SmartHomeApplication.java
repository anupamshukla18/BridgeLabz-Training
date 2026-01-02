package com.smarthomeautomationsystem;

public class SmartHomeApplication {
	public static void main(String[] args) {
		// Appliances
		Appliance light = new Light("Living Room Light");
		Appliance fan = new Fan("Bedroom Fan");
		Appliance ac = new AC("Hall AC");

		UserController controller = new UserController();

		// Polymorphism: same method, different behavior
		controller.operateDevice((Controllable) light, true);
		controller.operateDevice((Controllable) fan, true);
		controller.operateDevice((Controllable) ac, true);

		// Energy comparison
		controller.compareEnergy(light, ac);
		controller.compareEnergy(fan, light);

		// Turn off devices
		controller.operateDevice((Controllable) ac, false);
	}
}
