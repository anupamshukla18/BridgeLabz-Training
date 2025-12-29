/*
10. Phone Recharge Simulator 📱
Take the user's mobile operator and amount.
● Use a switch to display offers.
● Loop to allow repeated recharges.
● Show balance after each recharge.
*/

import java.util.Scanner;

public class PhoneRechargeSimulator {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double balance = 0;   // Stores total recharge balance
        int choice;           // To control loop

        do {
            System.out.println("\n----- Phone Recharge Simulator -----");
            
            // Taking operator input from user
            System.out.print("Enter Mobile Operator (Airtel / Jio / VI): ");
            String operator = sc.next().toLowerCase();   // converting to lowercase to avoid case issues

            // Taking recharge amount
            System.out.print("Enter Recharge Amount: ");
            double amount = sc.nextDouble();

            // Switch case to display offers based on operator
            switch (operator) {
                case "airtel":
                    System.out.println("Airtel Offer: Unlimited Calls + 1.5GB/day");
                    break;

                case "jio":
                    System.out.println("Jio Offer: Unlimited Calls + 2GB/day + Free OTT");
                    break;

                case "vi":
                    System.out.println("VI Offer: Unlimited Calls + Weekend Data Rollover");
                    break;

                default:
                    // Executes if user enters wrong operator name
                    System.out.println("Invalid Operator! Recharge processed without offer.");
            }

            // Adding recharge amount to total balance
            balance += amount;

            System.out.println("Recharge Successful! ");
            System.out.println("Current Balance: " + balance);   // Showing updated balance

            // Asking user whether to continue or exit
            System.out.println("\nPress 1 to Recharge Again or 0 to Exit:");
            choice = sc.nextInt();

        } while (choice == 1);   // Loop repeats if user enters 1

        System.out.println("\nThank you for using the Recharge Simulator! ");
       
		sc.close(); // Closing scanner
    }
}
