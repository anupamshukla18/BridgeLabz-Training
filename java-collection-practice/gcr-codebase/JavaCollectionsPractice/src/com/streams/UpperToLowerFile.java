package com.streams;

import java.io.*;

public class UpperToLowerFile {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("D:\\File Handling\\input.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\File Handling\\lowercase.txt"))) {

			String line;
			// Read each line and convert to lowercase
			while ((line = br.readLine()) != null) {
				bw.write(line.toLowerCase());
				bw.newLine();
			}

			System.out.println("Conversion completed.");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
