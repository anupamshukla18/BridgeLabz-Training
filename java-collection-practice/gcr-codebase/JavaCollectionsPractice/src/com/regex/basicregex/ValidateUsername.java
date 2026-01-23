package com.regex.basicregex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateUsername {
	public static void main(String[] args) {
		
		//regex
		String regex="[a-zA-Z][a-zA-Z0-9_]{4,14}$";
		
		//array of usernames
		String[] usernames= {"user_123","123user","us"};
		
		//checking the usernames
		Pattern pattern =Pattern.compile(regex);
		for(String username:usernames) {
			Matcher matcher=pattern.matcher(username);
			System.out.println(username+" is Valid: "+matcher.matches());
		}
	}
}
