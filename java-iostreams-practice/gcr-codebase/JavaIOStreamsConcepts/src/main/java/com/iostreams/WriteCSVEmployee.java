package com.iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class WriteCSVEmployee {
	public static void main(String[] args) {
		// output filepath
		String filePath = "D:\\File Handling\\CSV_Files\\employee.csv";

		try (CSVWriter writer = new CSVWriter(new FileWriter(filePath))) {

			String[] header = { "ID", "Name", "Department", "Salary" };

			String[] employee1 = { "1", "Vikash", "IT", "50000" };
			String[] employee2 = { "2", "Amit", "HR", "45000" };
			String[] employee3 = { "3", "Neha", "Finance", "60000" };
			String[] employee4 = { "4", "Rahul", "Marketing", "48000" };
			String[] employee5 = { "5", "Priya", "IT", "55000" };
			
			writer.writeNext(header);
			writer.writeNext(employee1);
			writer.writeNext(employee2);
			writer.writeNext(employee3);
			writer.writeNext(employee4);
			writer.writeNext(employee5);
		
			System.out.println("CSV file written successfully");
			

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
