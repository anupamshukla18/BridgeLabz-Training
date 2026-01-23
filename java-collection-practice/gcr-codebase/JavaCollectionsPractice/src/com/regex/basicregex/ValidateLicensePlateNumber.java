package com.regex.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateLicensePlateNumber {
	public static void main(String[] args) {
		
		//regex
		String regex="^[A-Z]{2}[0-9]{4}$";
		
		//array of license plate numbers
		String[] licenses= {"AB1234","A12345","XXAB1234YY","ab1234"};
		
		Pattern pattern=Pattern.compile(regex);
		
		//validating
		for(String license:licenses) {
			Matcher matcher=pattern.matcher(license);
			System.out.println(license+" is Valid :"+matcher.matches());
		}
	}

}
