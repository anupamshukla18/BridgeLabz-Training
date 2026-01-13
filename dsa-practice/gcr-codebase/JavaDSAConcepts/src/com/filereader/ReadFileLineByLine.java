package com.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
	public static void main(String[] args) throws IOException {

		// defining the path of file which i want to read
		String filePath = "D:/javaquestionset2.txt";

		// buffered reader and file reader for handling a file
		BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));

		String line;

		while ((line = bufferedReader.readLine()) != null) {
			System.out.println(line);
		}
	}
}
