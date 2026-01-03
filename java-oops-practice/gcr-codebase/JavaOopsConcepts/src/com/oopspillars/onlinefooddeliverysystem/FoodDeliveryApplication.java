package com.oopspillars.onlinefooddeliverysystem;

import java.util.*;

public class FoodDeliveryApplication {
	public static void main(String[] args) {
		// Polymorphic list
		List<FoodItem> orderItems = new ArrayList<>();

		orderItems.add(new VegItem("Paneer Burger", 120, 2));
		orderItems.add(new NonVegItem("Chicken Pizza", 350, 1));

		double grandTotal = 0;

		for (FoodItem item : orderItems) {

			item.getItemDetails();

			double totalPrice = item.calculateTotalPrice();
			System.out.println("Total Price: ₹" + totalPrice);

			if (item instanceof Discountable) {
				Discountable d = (Discountable) item;
				double discount = d.applyDiscount();
				System.out.println(d.getDiscountDetails());
				System.out.println("Discount Applied: ₹" + discount);
				totalPrice -= discount;
			}

			System.out.println("Payable Amount: ₹" + totalPrice);
			grandTotal += totalPrice;

			System.out.println("----------------------------------");
		}
		System.out.println("Grand Total Amount: ₹" + grandTotal);
	}
}
