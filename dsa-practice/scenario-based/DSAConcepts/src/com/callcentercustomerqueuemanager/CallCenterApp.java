package com.callcentercustomerqueuemanager;
import java.util.Scanner;

public class CallCenterApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CallCenterService service = new CallCenterService();

        while (true) {
            System.out.println("\n===== CALL CENTER MENU =====");
            System.out.println("1. Add Call");
            System.out.println("2. Serve Call");
            System.out.println("3. View Call Count");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Customer ID: ");
                    String id = sc.nextLine();

                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Is VIP (true/false): ");
                    boolean isVIP = sc.nextBoolean();

                    int priority = 0;
                    if (isVIP) {
                        System.out.print("Priority (1-10): ");
                        priority = sc.nextInt();
                    }

                    service.receiveCall(
                            new Customer(id, name, isVIP, priority)
                    );
                    break;

                case 2:
                    service.serveCall();
                    break;

                case 3:
                    service.showStatistics();
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option");
            }
        }
    }
}
