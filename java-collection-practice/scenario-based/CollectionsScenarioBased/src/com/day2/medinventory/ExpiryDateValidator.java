package com.day2.medinventory;

import java.util.regex.Pattern;

public class ExpiryDateValidator {

	private static final Pattern DATE_PATTERN = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

	public static boolean isValidFormat(String date) {
		return DATE_PATTERN.matcher(date).matches();
	}
}