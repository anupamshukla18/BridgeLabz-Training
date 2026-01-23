	package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractCapitalWord {
	public static void main(String[] args) {
		// regex
		String regex = "\\b[A-Z][a-z]+\\b";

		// text
		String emailText = "The Eiffel Tower is in Paris and the Statue of Liberty is in New York.";

		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(emailText);
		while (matcher.find()) {
			System.out.print(matcher.group() + ", ");
		}
	}
}
