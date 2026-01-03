package com.cabbygoriderailingapp;

interface IRideService {
	// for booking the ride
	void bookRide(Vehicle vehicle, Driver driver, double distance);

	// for ending the ride
	void endRide();
}
