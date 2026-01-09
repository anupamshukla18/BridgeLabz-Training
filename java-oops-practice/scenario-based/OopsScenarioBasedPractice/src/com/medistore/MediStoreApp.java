package com.medistore;
import java.time.LocalDate;
import java.util.Scanner;

public class MediStoreApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Medicine Type (1-Tablet, 2-Syrup, 3-Injection):");
        int type = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Medicine Name:");
        String name = sc.nextLine();

        System.out.println("Enter Price:");
        double price = sc.nextDouble();

        System.out.println("Enter Quantity:");
        int quantity = sc.nextInt();

        System.out.println("Enter Expiry Date (yyyy-mm-dd):");
        LocalDate expiry = LocalDate.parse(sc.next());

        Medicine med = null;

        if (type == 1)
            med = new Tablet(name, price, expiry, quantity);
        else if (type == 2)
            med = new Syrup(name, price, expiry, quantity);
        else if (type == 3)
            med = new Injection(name, price, expiry, quantity);

        System.out.println("Enter quantity to sell:");
        int sellQty = sc.nextInt();

        med.sell(sellQty);

        sc.close();
    }
}
