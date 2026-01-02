package com.smarthomeautomationsystem;

//AC appliance
class AC extends Appliance implements Controllable {
	public AC(String name) {
		super(name, 2000); // high energy usage
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println("AC ON - Cooling mode activated");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println("AC OFF");
	}
}
