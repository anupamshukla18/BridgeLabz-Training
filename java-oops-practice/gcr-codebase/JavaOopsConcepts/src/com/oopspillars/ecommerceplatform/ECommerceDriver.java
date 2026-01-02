package com.oopspillars.ecommerceplatform;

import java.util.*;
public class ECommerceDriver {
    // Polymorphic method
    public static void printFinalPrices(List<Product> products) {
        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();
            double tax = 0;

            if (p instanceof Taxable) {
                Taxable t = (Taxable) p;
                tax = t.calculateTax();
                System.out.println(t.getTaxDetails());
            } else {
                System.out.println("No Tax on this Product");
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("-----------------------------------");
        }
    }

    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Electronics("E101", "Laptop", 50000));
        products.add(new Clothing("C201", "Jacket", 3000));
        products.add(new Groceries("G301", "Rice Bag", 1200));

        printFinalPrices(products);
    }
}

