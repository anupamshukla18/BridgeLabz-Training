package com.regex.advancedproblems;

import java.util.regex.Pattern;

public class ValidateCreditCard {
	public static void main(String[] args) {

		String regex = "^(4\\d{15}|5\\d{15})$";

		String[] cardNumbers = { "4123456789012345", "5123456789012345", "6123456789012345", "41234567890123",
				"51234567890123456", "abcd123456789012" };

		for (String card : cardNumbers) {
			System.out.println(card + " is Valid: " + Pattern.matches(regex, card));
		}
	}
}
