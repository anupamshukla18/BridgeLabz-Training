package com.artifyartmarketplace;

import java.util.Scanner;

public class ArtifyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User creation
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.print("Enter wallet balance: ");
        double balance = sc.nextDouble();
        sc.nextLine();

        User user = new User(userName, balance);

        int choice;

        do {
            System.out.println("\n====== ARTIFY DIGITAL MARKETPLACE ======");
            System.out.println("1. Purchase Digital Art");
            System.out.println("2. Purchase Print Art");
            System.out.println("3. Check Wallet Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                case 2:
                    System.out.print("Enter Artwork Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Artist Name: ");
                    String artist = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();
                    sc.nextLine();

                    System.out.print("Enter License Type: ");
                    String license = sc.nextLine();

                    System.out.print("Preview available? (true/false): ");
                    boolean preview = sc.nextBoolean();
                    sc.nextLine();

                    Artwork artwork;

                    if (choice == 1) {
                        artwork = new DigitalArt(title, artist, price, license, preview);
                    } else {
                        artwork = new PrintArt(title, artist, price, license, preview);
                    }

                    artwork.purchase(user);
                    artwork.license();
                    break;

                case 3:
                    System.out.println("Wallet Balance: ₹" + user.getWalletBalance());
                    break;

                case 4:
                    System.out.println("Exiting Artify... Thank you");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}

