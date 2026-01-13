package com.homenest;

class Light extends Device {

	Light(String id) {
		super(id, 0.5);
	}

	public void reset() {
		System.out.println("Light reset: Brightness set to default");
		firmwareLog();
	}
}
