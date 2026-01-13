package com.homenest;

class Camera extends Device {

	Camera(String id) {
		super(id, 1.2);
	}

	public void reset() {
		System.out.println("Camera reset: Angle and focus reset");
		firmwareLog();
	}
}
