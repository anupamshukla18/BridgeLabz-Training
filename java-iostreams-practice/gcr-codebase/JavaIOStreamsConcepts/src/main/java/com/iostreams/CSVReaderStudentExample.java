package com.iostreams;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReaderStudentExample {

	// Student class in same file
	static class Student {
		int id;
		String name;
		int age;
		int marks;

		Student(int id, String name, int age, int marks) {
			this.id = id;
			this.name = name;
			this.age = age;
			this.marks = marks;
		}

		@Override
		public String toString() {
			return "Student{" + "ID=" + id + ", Name='" + name + '\'' + ", Age=" + age + ", Marks=" + marks + '}';
		}
	}

	public static void main(String[] args) {

		String filePath = "D:\\File Handling\\CSV_Files\\students.csv";
		List<Student> students = new ArrayList<>();

		try (CSVReader csvReader = new CSVReader(new FileReader(filePath))) {

			String[] row;

			// Skip header
			csvReader.readNext();

			while ((row = csvReader.readNext()) != null) {

				Student student = new Student(Integer.parseInt(row[0]), row[1], Integer.parseInt(row[2]),
						Integer.parseInt(row[3]));

				students.add(student);
			}

		} catch (IOException | CsvValidationException e) {
			e.printStackTrace();
		}

		// Print students
		System.out.println("Student Records:");
		System.out.println("----------------");

		for (Student student : students) {
			System.out.println(student);
		}
	}
}
