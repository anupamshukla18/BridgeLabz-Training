package com.smarthomeautomationsystem;

//Controller class used by user
class UserController {
	// Control any appliance polymorphically
	public void operateDevice(Controllable device, boolean turnOn) {
		if (turnOn) {
			device.turnOn();
		} else {
			device.turnOff();
		}
	}

	// Compare energy usage using operators
	public void compareEnergy(Appliance a1, Appliance a2) {

		System.out.println("\nEnergy Comparison:");

		if (a1.getEnergyUsage() > a2.getEnergyUsage()) {
			System.out.println(a1.applianceName + " uses more energy than " + a2.applianceName);
		} else if (a1.getEnergyUsage() < a2.getEnergyUsage()) {
			System.out.println(a1.applianceName + " uses less energy than " + a2.applianceName);
		} else {
			System.out.println(a1.applianceName + " and " + a2.applianceName + " use equal energy");
		}
	}
}
