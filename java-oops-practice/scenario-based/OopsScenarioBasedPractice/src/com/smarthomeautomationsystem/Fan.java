package com.smarthomeautomationsystem;

//Fan appliance
class Fan extends Appliance implements Controllable {
	public Fan(String name) {
		super(name, 120);
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println("Fan ON - Medium speed running");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println("Fan OFF");
	}
}
