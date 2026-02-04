package com.collectors.wordfrequency;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        String paragraph = "java is powerful and java is popular and java is everywhere";

        // Split paragraph into words
        String[] words = paragraph.split("\\s+");

        // Count word frequency using Collectors.toMap()
        Map<String, Integer> wordFrequencyMap =
                Arrays.stream(words)
                        .collect(Collectors.toMap(
                                word -> word,      // key mapper
                                word -> 1,         // value mapper
                                Integer::sum       // merge function
                        ));

        System.out.println(wordFrequencyMap);
    }
}
