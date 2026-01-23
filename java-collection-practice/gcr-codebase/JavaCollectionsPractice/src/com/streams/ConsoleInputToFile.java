package com.streams;

import java.io.*;

public class ConsoleInputToFile {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				FileWriter fw = new FileWriter("D:\\File Handling\\user_details.txt")) {

			// Reading user input
			System.out.print("Enter name: ");
			String name = br.readLine();

			System.out.print("Enter age: ");
			String age = br.readLine();

			System.out.print("Enter favorite language: ");
			String language = br.readLine();

			// Writing data to file
			fw.write("Name: " + name + "\n");
			fw.write("Age: " + age + "\n");
			fw.write("Language: " + language + "\n");

			System.out.println("User data saved successfully.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
