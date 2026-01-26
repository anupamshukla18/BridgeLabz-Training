package com.day1.coderepocleaner;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class CodeRepoCleaner {

	public static Map<FileCategory, List<File>> processFiles(String sourceDir) {

		Map<FileCategory, List<File>> fileMap = new HashMap<>();
		for (FileCategory cat : FileCategory.values()) {
			fileMap.put(cat, new ArrayList<>());
		}

		try {
			List<Path> javaFiles = FileScanner.scanJavaFiles(sourceDir);

			for (Path path : javaFiles) {

				File file = path.toFile();
				String content = Files.readString(path);

				boolean badMethods = JavaFileAnalyzer.hasBadMethodNames(content);
				boolean unusedImports = JavaFileAnalyzer.hasUnusedImports(content);

				if (badMethods) {
					fileMap.get(FileCategory.ERRORS).add(file);
				} else if (unusedImports) {
					fileMap.get(FileCategory.WARNINGS).add(file);
				} else {
					fileMap.get(FileCategory.VALID).add(file);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return fileMap;
	}

	public static void organizeFiles(Map<FileCategory, List<File>> fileMap, String outputDir) throws IOException {

		for (Map.Entry<FileCategory, List<File>> entry : fileMap.entrySet()) {

			Path categoryDir = Paths.get(outputDir, entry.getKey().name());
			Files.createDirectories(categoryDir);

			for (File file : entry.getValue()) {
				Files.copy(file.toPath(), categoryDir.resolve(file.getName()), StandardCopyOption.REPLACE_EXISTING);
			}
		}
	}
}