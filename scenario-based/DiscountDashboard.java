/*
8. Shopkeeper’s Discount Dashboard 🛍️
A shopkeeper gives discounts based on total bill:
● Input item prices in a for-loop.
● Use if-else for discount logic.
● Use proper indentation, constants, and comments.
*/

import java.util.Scanner;

class DiscountDashboard {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Taking the number of items as input
		System.out.println("Enter the total number of items: ");
		int items = input.nextInt();
		
		// An array for storing the price of the items
		double[] itemsPrice = new double[items]; 
		
		// For storing the total bill
		double totalBill = 0.0; 
		
		// A loop for designating the prices
		for (int i = 0; i < items; i++) {
			System.out.println("Enter price " + (i + 1) + ": ");
			itemsPrice[i] = input.nextDouble();
		}
		
		// A loop for giving discounts 
		for (int i = 0; i < items; i++) {
			if (itemsPrice[i] >= 0 && itemsPrice[i] <= 500) {
				double discount = itemsPrice[i] * 0.05;
				itemsPrice[i] -= discount;
				totalBill += itemsPrice[i];
			} else if (itemsPrice[i] >= 500 && itemsPrice[i] <= 1000) {
				double discount = itemsPrice[i] * 0.10;
				itemsPrice[i] -= discount;
				totalBill += itemsPrice[i];
			} else {
				double discount = itemsPrice[i] * 0.20;
				itemsPrice[i] -= discount;
				totalBill += itemsPrice[i];
			}
		}
		
		// Displaying the total bill 
		System.out.println("Total bill: " + totalBill);
		
		input.close();
	} 
}