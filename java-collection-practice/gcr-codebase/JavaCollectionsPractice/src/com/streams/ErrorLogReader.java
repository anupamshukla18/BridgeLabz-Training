package com.streams;

import java.io.*;

public class ErrorLogReader {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new FileReader("D:\\File Handling\\largefile.txt"))) {

			String line;
			while ((line = br.readLine()) != null) {
				if (line.toLowerCase().contains("error")) {
					System.out.println(line);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
