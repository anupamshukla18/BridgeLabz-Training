package com.inheritance.assistedproblems.vehicle;

public class VehicleDriver {
    public static void main(String[] args) {

        Vehicle v1 = new Car(180, "Petrol", 5);
        Vehicle v2 = new Truck(120, "Diesel", 10);
        Vehicle v3 = new Motorcycle(160, "Petrol", true);

        // Polymorphism - Vehicle reference holding different objects
        Vehicle vehicles[] = {v1, v2, v3};

        for (Vehicle v : vehicles) {
            v.displayInfo();   // Runtime Polymorphism
        }
    }
}
