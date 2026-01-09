package com.medistore;
import java.time.LocalDate;

class Medicine implements ISellable {

    private String name;
    private double price;
    private int quantity;
    private LocalDate expiryDate;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10);
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Sell medicine
    public void sell(int qty) {
        if (qty <= quantity && !checkExpiry()) {
            quantity -= qty;
            double total = calculatePrice(qty);
            System.out.println(qty + " sold. Total price = " + total);
        } else {
            System.out.println("Cannot sell medicine.");
        }
    }

    // Price calculation (hidden logic)
    private double calculatePrice(int qty) {
        double total = price * qty;   // operator used
        if (qty > 5) {
            total -= total * 0.10;   // 10% discount
        }
        return total;
    }

    // Default expiry check
    public boolean checkExpiry() {
        return LocalDate.now().isAfter(expiryDate);
    }

    protected LocalDate getExpiryDate() {
        return expiryDate;
    }

    protected String getName() {
        return name;
    }
}
