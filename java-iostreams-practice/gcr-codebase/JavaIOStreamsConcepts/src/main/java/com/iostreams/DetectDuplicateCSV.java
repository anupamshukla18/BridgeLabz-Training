package com.iostreams;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class DetectDuplicateCSV {

    public static void main(String[] args) {

        String filePath = "D:\\File Handling\\CSV_Files\\employee.csv";

        // Set to store unique IDs
        Set<String> seenIds = new HashSet<>();

        boolean duplicateFound = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

            String line;

            // Skip header
            reader.readLine();

            System.out.println("Duplicate Records Found:");
            System.out.println("-------------------------");

            while ((line = reader.readLine()) != null) {

                if (line.trim().isEmpty()) {
                    continue;
                }

                // Works for comma or tab separated files
                String[] data = line.split("[,\t]");

                String id = data[0];

                // If add() returns false → duplicate
                if (!seenIds.add(id)) {
                    System.out.println(line);
                    duplicateFound = true;
                }
            }

            if (!duplicateFound) {
                System.out.println("No duplicate records found.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
