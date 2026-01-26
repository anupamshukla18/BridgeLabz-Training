package com.day1.coderepocleaner;

import java.util.List;
import java.util.Map;

public class MainApp {

    public static void main(String[] args) throws Exception {

        String sourceDir = "source";
        String outputDir = "output";

        Map<FileCategory, List<java.io.File>> result =
                CodeRepoCleaner.processFiles(sourceDir);

        CodeRepoCleaner.organizeFiles(result, outputDir);

        System.out.println("---- Cleaning Report ----");
        result.forEach((k, v) ->
                System.out.println(k + " : " + v.size() + " files"));
    }
}