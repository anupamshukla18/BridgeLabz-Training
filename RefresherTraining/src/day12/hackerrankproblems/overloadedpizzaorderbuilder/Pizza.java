package day12.hackerrankproblems.overloadedpizzaorderbuilder;

public class Pizza {

	private String size;
	private String crustType;
	private int toppingsCount;
	private double price;

	public Pizza(String size) {
		this(size, "Regular", 0);
	}

	public Pizza(String size, String crustType) {
		this(size, crustType, 0);
	}

	public Pizza(String size, String crustType, int toppingsCount) {
		this(size, crustType, toppingsCount, calculatePrice(size, toppingsCount));
	}

	public Pizza(String size, String crustType, int toppingsCount, double price) {
		this.size = size;
		this.crustType = crustType;
		this.toppingsCount = toppingsCount;
		this.price = price;
	}

	private static double calculatePrice(String size, int toppingsCount) {
		double basePrice;

		if (size.equalsIgnoreCase("Small")) {
			basePrice = 150;
		} else if (size.equalsIgnoreCase("Medium")) {
			basePrice = 250;
		} else {
			basePrice = 350;
		}

		return basePrice + (toppingsCount * 30);
	}

	public void displayPizza() {
		System.out.println(size + " | " + crustType + " | " + toppingsCount + " toppings | Rs. " + price);
	}
}