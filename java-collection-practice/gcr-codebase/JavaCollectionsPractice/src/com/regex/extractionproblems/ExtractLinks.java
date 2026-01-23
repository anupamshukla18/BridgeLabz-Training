package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractLinks {
	public static void main(String[] args) {
		// regex
		String regex = "https?://[a-zA-Z0-9.-]+\\b";

		// text with links
		String emailText = "Visit https://www.google.com and http://example.org for more info.";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailText);
		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}
