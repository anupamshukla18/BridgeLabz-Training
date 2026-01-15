package com.payxpress;
import java.time.LocalDate;

// Abstract base class for all bills
public abstract class Bill implements IPayable {

    // Payment status is kept private (encapsulation)
    private boolean isPaid;

    protected String type;
    protected double amount;
    protected LocalDate dueDate;

    // Constructor for one-time bill
    public Bill(String type, double amount, LocalDate dueDate) {
        this.type = type;
        this.amount = amount;
        this.dueDate = dueDate;
        this.isPaid = false;
    }

    // Constructor for recurring bill
    public Bill(String type, double amount) {
        this(type, amount, LocalDate.now().plusMonths(1));
    }

    // Marks the bill as paid
    protected void markAsPaid() {
        isPaid = true;
    }

    // Returns payment status
    public boolean isPaid() {
        return isPaid;
    }

    // Calculates late fee using operator
    public double calculateLateFee(double penalty) {
        return amount + penalty;
    }

    // Common payment method
    @Override
    public void pay() {
        if (!isPaid) {
            markAsPaid();
            System.out.println(type + " bill paid successfully.");
        } else {
            System.out.println(type + " bill already paid.");
        }
    }

    // Abstract method for reminder
    public abstract void sendReminder();
}
