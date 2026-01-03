package com.cabbygoriderailingapp;

class RideService implements IRideService {
    // Sensitive data (hidden)
    private double fare;
    private boolean rideActive;

    @Override
    public void bookRide(Vehicle vehicle, Driver driver, double distance) {
        fare = vehicle.calculateFare(distance);
        rideActive = true;

        System.out.println("Ride Booked");
        System.out.println("Vehicle Type: " + vehicle.getType());
        System.out.println("Driver: " + driver.getName());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Fare: ₹" + fare);
    }

    @Override
    public void endRide() {
        if (rideActive) {
            System.out.println("Ride Ended. Thank you for riding with CabbyGo!");
            rideActive = false;
        } else {
            System.out.println("No active ride.");
        }
    }
}
