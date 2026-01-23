package com.junittesting.stringutils;

public class StringUtils {

	// reverse string
	public String reverse(String value) {
		return new StringBuilder(value).reverse().toString();
	}

	// check palindrome
	public boolean isPalindrome(String value) {
		return value.equals(reverse(value));
	}

	// convert to uppercase
	public String toUpperCase(String value) {
		return value.toUpperCase();
	}
}
