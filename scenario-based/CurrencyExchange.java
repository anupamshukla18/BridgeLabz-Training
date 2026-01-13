/*
18. Currency Exchange Kiosk 💱
Design a currency converter:
● Take INR amount and target currency.
● Use a switch to apply the correct rate.
● Ask if the user wants another conversion (do-while).
*/

import java.util.Scanner;

class CurrencyExchange {
	public static void main(String[] args) {
		//create a scanner object
		Scanner input = new Scanner(System.in);
		
		//taking the amount in INR as input
		System.out.print("Enter the amount in INR that you want to convert: ");
		double amount = input.nextInt();
		
		//for managing the number of iterations
		boolean flag = true;
		
		do { //Printing the welcome message
			System.out.println("-----Welcome to the currency converter!!!-----");
			System.out.println("1-> To convert in USD");
			System.out.println("2-> To convert in EUR");
			System.out.println("3-> To convert in KWD");
			System.out.println("4-> To Exit");
			System.out.print("Enter your choice(1/2/3): ");
			int choice = input.nextInt();
			
			//switch statement for converting giving the options
			switch (choice) {
				case 1 :
					amount = amount / 89.88;
					System.out.println("The currency in USD: " + amount);
					break;
				case 2 : 
					amount = amount / 104.88;
					System.out.println("The currency in EUR: " + amount);
					break;
				case 3 :
					amount = amount / 292.95;
					System.out.println("The currency in KWD: " + amount);
					break;
				case 4 :
					System.out.println("Thank you for choosing us!!");
					System.out.println("Your amount is: " + amount);
					flag = false;
					break;
				default: 
					System.out.println("Invalid Input!!!");
			}
		} while(flag);
	}
}