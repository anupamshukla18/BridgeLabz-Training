package com.iostreams;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.exceptions.CsvValidationException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class JsonCsvConverter {

    // Student class (same file)
    static class Student {
        public int id;
        public String name;
        public int age;
        public int marks;
    }

    public static void main(String[] args) {

        String jsonFile = "students.json";
        String csvFile = "students.csv";
        String jsonOutputFile = "students_from_csv.json";

        convertJsonToCsv(jsonFile, csvFile);
        convertCsvToJson(csvFile, jsonOutputFile);
    }

    // 🔁 JSON → CSV
    private static void convertJsonToCsv(String jsonFile, String csvFile) {

        ObjectMapper mapper = new ObjectMapper();

        try (
                CSVWriter writer = new CSVWriter(new FileWriter(csvFile))
        ) {

            List<Student> students =
                    mapper.readValue(
                            new FileReader(jsonFile),
                            new TypeReference<List<Student>>() {}
                    );

            // Write header
            writer.writeNext(new String[]{"ID", "Name", "Age", "Marks"});

            // Write data
            for (Student s : students) {
                writer.writeNext(new String[]{
                        String.valueOf(s.id),
                        s.name,
                        String.valueOf(s.age),
                        String.valueOf(s.marks)
                });
            }

            System.out.println("JSON converted to CSV successfully.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // 🔁 CSV → JSON
    private static void convertCsvToJson(String csvFile, String jsonOutputFile) {

        List<Student> students = new ArrayList<>();
        ObjectMapper mapper = new ObjectMapper();

        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {

            String[] row;

            // Skip header
            reader.readNext();

            while ((row = reader.readNext()) != null) {

                Student s = new Student();
                s.id = Integer.parseInt(row[0]);
                s.name = row[1];
                s.age = Integer.parseInt(row[2]);
                s.marks = Integer.parseInt(row[3]);

                students.add(s);
            }

            mapper.writerWithDefaultPrettyPrinter()
                  .writeValue(new FileWriter(jsonOutputFile), students);

            System.out.println("CSV converted to JSON successfully.");

        } catch (IOException | CsvValidationException e) {
            e.printStackTrace();
        }
    }
}
