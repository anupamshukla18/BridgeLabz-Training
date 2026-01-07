package com.smartparkingapplication;
import java.util.Scanner;

public class ParkEaseApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create parking slot
        ParkingSlot slot = new ParkingSlot("A1", "ALL");

        Vehicle vehicle = null;
        boolean exit = false;

        while (!exit) {
            System.out.println("\n===== ParkEase Menu =====");
            System.out.println("1. Park Vehicle");
            System.out.println("2. Calculate Charges");
            System.out.println("3. Vacate Slot");
            System.out.println("4. Check Slot Availability");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (!slot.isAvailable()) {
                        System.out.println("Slot already occupied!");
                        break;
                    }

                    System.out.println("Select Vehicle Type:");
                    System.out.println("1. Car");
                    System.out.println("2. Bike");
                    System.out.println("3. Truck");
                    System.out.print("Choice: ");
                    int vChoice = sc.nextInt();

                    System.out.print("Enter Vehicle Number: ");
                    sc.nextLine(); // consume newline
                    String vNumber = sc.nextLine();

                    switch (vChoice) {
                        case 1:
                            vehicle = new Car(vNumber);
                            break;
                        case 2:
                            vehicle = new Bike(vNumber);
                            break;
                        case 3:
                            vehicle = new Truck(vNumber);
                            break;
                        default:
                            System.out.println("Invalid vehicle type!");
                            vehicle = null;
                    }

                    if (vehicle != null) {
                        slot.parkVehicle(vehicle);
                    }
                    break;

                case 2:
                    if (slot.isAvailable()) {
                        System.out.println("No vehicle parked!");
                        break;
                    }

                    System.out.print("Enter parking duration (hours): ");
                    int hours = sc.nextInt();
                    double bill = slot.calculateCharges(hours);
                    System.out.println("Total Parking Charges: ₹" + bill);
                    break;

                case 3:
                    if (slot.isAvailable()) {
                        System.out.println("Slot already empty!");
                    } else {
                        slot.vacateSlot();
                    }
                    break;

                case 4:
                    if (slot.isAvailable()) {
                        System.out.println("Slot is AVAILABLE");
                    } else {
                        System.out.println("Slot is OCCUPIED");
                    }
                    break;

                case 0:
                    exit = true;
                    System.out.println("Thank you for using ParkEase!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }

        sc.close();
    }
}
