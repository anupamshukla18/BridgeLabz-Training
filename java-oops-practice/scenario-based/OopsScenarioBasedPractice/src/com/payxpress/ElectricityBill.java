package com.payxpress;
import java.time.LocalDate;

// Child class for electricity bill
public class ElectricityBill extends Bill {

    // Constructor
    public ElectricityBill(double amount, LocalDate dueDate) {
        super("Electricity", amount, dueDate);
    }

    // Sends electricity bill reminder
    @Override
    public void sendReminder() {
        System.out.println("Electricity bill is due on " + dueDate);
    }
}
