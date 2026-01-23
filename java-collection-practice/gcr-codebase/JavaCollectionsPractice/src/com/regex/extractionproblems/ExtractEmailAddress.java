package com.regex.extractionproblems;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmailAddress {
	public static void main(String[] args) {

		//regex
		String regex="[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z]{2,}";
		
		//email text
		String emailText="Contact us at support@example.com and info@company.org";
		
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(emailText);
		while(matcher.find()) {
			System.out.println(matcher.group());		
		}
	}
}
