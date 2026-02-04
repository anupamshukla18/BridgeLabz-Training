package com.collectors.library;
import java.util.*;
import java.util.stream.Collectors;

public class LibraryBookStatistics {

    public static void main(String[] args) {

        List<Book> books = Arrays.asList(
                new Book("Java Basics", "Programming", 450),
                new Book("Advanced Java", "Programming", 650),
                new Book("Spring in Action", "Programming", 520),
                new Book("Harry Potter", "Fantasy", 350),
                new Book("Lord of the Rings", "Fantasy", 720),
                new Book("The Hobbit", "Fantasy", 310),
                new Book("Rich Dad Poor Dad", "Finance", 280)
        );

        // Statistics per genre
        Map<String, IntSummaryStatistics> statisticsByGenre =
                books.stream()
                        .collect(Collectors.groupingBy(
                                Book::getGenre,
                                Collectors.summarizingInt(Book::getPages)
                        ));

        // Display results
        statisticsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
            System.out.println("---------------------------");
        });
    }
}
