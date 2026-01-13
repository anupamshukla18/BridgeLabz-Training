package com.ambulancerouteapplication;


import java.util.Scanner;

public class AmbulanceApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AmbulanceManager manager = new AmbulanceManager();

        int choice;
        do {
            System.out.println("\n====== Ambulance Route Management ======");
            System.out.println("1. Display Hospital Units");
            System.out.println("2. Redirect Patient");
            System.out.println("3. Remove Hospital Unit");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1:
                    manager.displayUnits();
                    break;

                case 2:
                    manager.redirectPatient();
                    break;

                case 3:
                    System.out.print("Enter unit name to remove: ");
                    String unitName = sc.nextLine();
                    manager.removeUnit(unitName);
                    break;

                case 4:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
