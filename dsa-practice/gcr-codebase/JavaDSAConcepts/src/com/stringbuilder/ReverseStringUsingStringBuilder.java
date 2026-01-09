package com.stringbuilder;
public class ReverseStringUsingStringBuilder {

    public static void main(String[] args) {

        // Input string
        String input = "hello";

        // Step 1: Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Step 2: Append the string to StringBuilder
        sb.append(input);

        // Step 3: Reverse the string using reverse() method
        sb.reverse();

        // Step 4: Convert StringBuilder back to String
        String reversedString = sb.toString();

        // Output
        System.out.println("Original String: " + input);
        System.out.println("Reversed String: " + reversedString);
    }
}
