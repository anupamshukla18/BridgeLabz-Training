package com.collectors.studentresultgrouping;
import java.util.*;
import java.util.stream.Collectors;

public class StudentResultGrouping {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student("Rahul", "A"),
                new Student("Anita", "B"),
                new Student("Suresh", "A"),
                new Student("Priya", "C"),
                new Student("Neha", "B")
        );

        Map<String, List<String>> groupedResult =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(
                                        Student::getName,
                                        Collectors.toList()
                                )
                        ));

        System.out.println(groupedResult);
    }
}
