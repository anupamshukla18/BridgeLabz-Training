package com.day2.dealtracker.reader;

import java.io.FileInputStream;

/**
 * Reads deal file using FileInputStream
 */
public class DealFileReader {

	public static String readFile(String path) throws Exception {

		FileInputStream fis = new FileInputStream(path);
		byte[] data = fis.readAllBytes();
		fis.close();

		return new String(data);
	}
}