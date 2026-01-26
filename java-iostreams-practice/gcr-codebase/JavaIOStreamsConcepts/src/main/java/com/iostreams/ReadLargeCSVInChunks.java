package com.iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadLargeCSVInChunks {

	private static final int CHUNK_SIZE = 100;

	public static void main(String[] args) {

		String filePath = "D:\\File Handling\\CSV_Files\\employee.csv";

		int totalRecordsProcessed = 0;
		List<String> batch = new ArrayList<>(CHUNK_SIZE);

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			// Skip header
			reader.readLine();

			while ((line = reader.readLine()) != null) {

				if (line.trim().isEmpty()) {
					continue;
				}

				batch.add(line);

				// When batch reaches 100 lines → process it
				if (batch.size() == CHUNK_SIZE) {
					totalRecordsProcessed += processBatch(batch);
					batch.clear(); // IMPORTANT: free memory
				}
			}

			// Process remaining records (if any)
			if (!batch.isEmpty()) {
				totalRecordsProcessed += processBatch(batch);
				batch.clear();
			}

			System.out.println("Total Records Processed: " + totalRecordsProcessed);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// Simulates processing of 100 records at a time
	private static int processBatch(List<String> batch) {

		int batchSize = batch.size();

		System.out.println("Processed batch of " + batchSize + " records");

		return batchSize;
	}
}
