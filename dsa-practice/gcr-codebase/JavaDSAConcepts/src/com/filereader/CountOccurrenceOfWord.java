package com.filehandling.filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountOccurrenceOfWord {
	public static void main(String[] args) {

		try {
			BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
			// defining the path of file which i want to read
			String filePath = "D://Java is powerful.txt";

			//taking the input for target word
			System.out.println("Enter the word which you want to count the occurence: ");
			String targetWord = bufferReader.readLine().trim();

			// creating object of FileReader and BufferedReader
			FileReader fileReader = new FileReader(filePath);
			BufferedReader fileBuffer = new BufferedReader(fileReader);

			String line;
			int count = 0;
			
			//reading file line by line 
			while ((line = fileBuffer.readLine()) != null) {
				
				//splitting line into words
				String[] words = line.split("\\W+");
				for (String word : words) {
					if (word.equalsIgnoreCase(targetWord)) {
						count++;
					}
				}
			}

			System.out.println("The word '" + targetWord + "' appears " + count + " times.");
			
			//closing input stream
			fileBuffer.close();
			fileReader.close();
			bufferReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
