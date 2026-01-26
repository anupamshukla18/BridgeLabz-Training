package com.iostreams;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MergeCSVFiles {

    public static void main(String[] args) {

        String file1 = "D:\\File Handling\\CSV_Files\\students1.csv";;
        String file2 = "D:\\File Handling\\CSV_Files\\students2.csv";
        String outputFile = "D:\\File Handling\\CSV_Files\\students_merged.csv";

        // Map<ID, StudentData>
        Map<String, String[]> studentMap = new HashMap<>();

        try (
                CSVReader reader1 = new CSVReader(new FileReader(file1));
                CSVReader reader2 = new CSVReader(new FileReader(file2));
                CSVWriter writer = new CSVWriter(new FileWriter(outputFile))
        ) {

            String[] row;

            // ---------- READ FIRST CSV ----------
            reader1.readNext(); // skip header

            while ((row = reader1.readNext()) != null) {
                // row = ID, Name, Age
                studentMap.put(row[0], new String[]{row[1], row[2]});
            }		

            // ---------- WRITE HEADER ----------
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks", "Grade"});

            // ---------- READ SECOND CSV ----------
            reader2.readNext(); // skip header

            while ((row = reader2.readNext()) != null) {
                // row = ID, Marks, Grade
                String id = row[0];

                if (studentMap.containsKey(id)) {
                    String[] studentInfo = studentMap.get(id);

                    writer.writeNext(new String[]{
                            id,
                            studentInfo[0], // Name
                            studentInfo[1], // Age
                            row[1],         // Marks
                            row[2]          // Grade
                    });
                }
            }

            System.out.println("CSV files merged successfully into students_merged.csv");

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
