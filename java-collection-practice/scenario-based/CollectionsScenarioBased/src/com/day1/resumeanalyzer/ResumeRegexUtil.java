package com.day1.resumeanalyzer;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ResumeRegexUtil {

	private static final Pattern EMAIL_PATTERN = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-z0-9]+\\.[a-zA-Z]{2,}");
	private static final Pattern PHONE_PATTERN = Pattern.compile("(\\+91[- ]?)?[0-9]{10}");
	private static final Pattern KEYWORD_PATTERN = Pattern.compile("\\b(Java | Python | Spring)\\b",
			Pattern.CASE_INSENSITIVE);

	public static String extractEmail(String text) {
		Matcher matcher = EMAIL_PATTERN.matcher(text);
		return matcher.find() ? matcher.group() : null;
	}

	public static String extractPhone(String text) {
		Matcher matcher = PHONE_PATTERN.matcher(text);
		return matcher.find() ? matcher.group() : null;
	}

	public static int countKeywords(String text) {
		Matcher matcher = KEYWORD_PATTERN.matcher(text);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		return count;
	}

}