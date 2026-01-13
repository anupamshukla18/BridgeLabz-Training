package com.trafficmanager;
import java.util.Scanner;

public class TrafficSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TrafficManager tm = new TrafficManager(5);

        int choice;

        do {
            System.out.println("\n--- TRAFFIC MANAGER ---");
            System.out.println("1. Add vehicle to waiting queue");
            System.out.println("2. Add vehicle to roundabout");
            System.out.println("3. Remove vehicle from roundabout");
            System.out.println("4. Print roundabout");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter vehicle number: ");
                    tm.addToQueue(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter vehicle number: ");
                    tm.addToRoundabout(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Enter vehicle number to remove: ");
                    tm.removeVehicle(sc.nextLine());
                    break;

                case 4:
                    tm.printRoundabout();
                    break;

                case 5:
                    System.out.println("Exiting system.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}
