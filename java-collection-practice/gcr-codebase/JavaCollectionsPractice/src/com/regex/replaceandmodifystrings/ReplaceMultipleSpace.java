package com.regex.replaceandmodifystrings;

public class ReplaceMultipleSpace {
	public static void main(String[] args) {
		
		String inputString="This is an example with multiple spaces.";
		
		inputString=inputString.replaceAll("\\s+"," ");
		
		System.out.println(inputString);
		
	}
}
