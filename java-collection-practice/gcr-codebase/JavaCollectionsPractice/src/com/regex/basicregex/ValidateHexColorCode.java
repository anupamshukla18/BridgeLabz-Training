package com.regex.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateHexColorCode {
	public static void main(String[] args) {
		
		//regex
		String regex="^#[0-9A-Fa-f]{6}$";
		
		//array of hex color codes
		String[] licenses= {"#FFA500","#ff4500","#123","ab1234","#12AB23"};
		
		Pattern pattern=Pattern.compile(regex);
		
		//validating
		for(String license:licenses) {
			Matcher matcher=pattern.matcher(license);
			System.out.println(license+" is Valid :"+matcher.matches());
		}
	}

}
