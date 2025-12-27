package com.constructor.levelone;

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle v1 = new Vehicle("Anupam Shukla", "Car");
        Vehicle v2 = new Vehicle("Rahul Verma", "Bike");

        System.out.println("Before Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        // Update registration fee for all vehicles
        Vehicle.updateRegistrationFee(7500.0);

        System.out.println("After Updating Registration Fee:");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        
    }
}
