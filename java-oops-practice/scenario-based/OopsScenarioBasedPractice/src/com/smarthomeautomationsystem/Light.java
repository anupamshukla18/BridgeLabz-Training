package com.smarthomeautomationsystem;

//Light appliance
class Light extends Appliance implements Controllable {
	public Light(String name) {
		super(name, 60); // low energy usage
	}

	@Override
	public void turnOn() {
		setPowerStatus(true);
		System.out.println("Light ON - Soft lighting enabled");
	}

	@Override
	public void turnOff() {
		setPowerStatus(false);
		System.out.println("Light OFF");
	}
}
