package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Students {
	public static void main(String[] args) {

		// file path
		String filePath = "D:\\File Handling\\CSV_Files\\students.csv";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {

			// read line by line
			String line;

			// skip the header
			// String header = bufferedReader.readLine();

			while ((line = bufferedReader.readLine()) != null) {
				String[] columns = line.split(",");
				System.out.println(columns[0]+", " + columns[1] +", " +  columns[2] +", " + columns[3]);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
