package com.loanapprovalautomation;

import java.util.Scanner;

public class LoanBuddyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Welcome to LoanBuddy =====");

        // ---------- Applicant Input ----------
        System.out.print("Enter Applicant Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Credit Score: ");
        int creditScore = sc.nextInt();

        System.out.print("Enter Monthly Income: ");
        double income = sc.nextDouble();

        System.out.print("Enter Loan Amount: ");
        double loanAmount = sc.nextDouble();

        // ---------- Loan Period ----------
        System.out.print("Enter Loan Period (in months): ");
        int period = sc.nextInt();

        Applicant applicant =
                new Applicant(name, creditScore, income, loanAmount);

        // ---------- Loan Selection ----------
        System.out.println("\nSelect Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Auto Loan");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        LoanApplication loan = null;

        switch (choice) {
            case 1:
                loan = new HomeLoan(applicant, period);
                break;

            case 2:
                loan = new AutoLoan(applicant, period);
                break;

            default:
                System.out.println("Invalid Loan Type Selected ❌");
                sc.close();
                return;
        }

        // ---------- Loan Processing ----------
        System.out.println("\nProcessing Loan Application...");

        if (loan.approveLoan()) {
            System.out.println("Loan Approved");
            System.out.printf("Monthly EMI: ₹%.2f%n", loan.calculateEMI());
            System.out.println("Loan Period: " + period + " months");
        } else {
            System.out.println("Loan Rejected");
            System.out.println("Reason: Eligibility criteria not met.");
        }

        sc.close();
    }
}
