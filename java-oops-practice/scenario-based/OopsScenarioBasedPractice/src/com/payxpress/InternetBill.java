package com.payxpress;
// Child class for internet bill
public class InternetBill extends Bill {

    // Constructor for recurring bill
    public InternetBill(double amount) {
        super("Internet", amount);
    }

    // Sends internet bill reminder
    @Override
    public void sendReminder() {
        System.out.println("Internet bill payment is pending. Due date: " + dueDate);
    }
}
