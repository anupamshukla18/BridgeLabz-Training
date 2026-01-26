package com.day1.coderepocleaner;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileScanner {

	public static List<Path> scanJavaFiles(String rootDir) throws IOException {

		try (Stream<Path> paths = Files.walk(Paths.get(rootDir))) {
			return paths.filter(Files::isRegularFile).filter(p -> p.toString().endsWith(".java"))
					.collect(Collectors.toList());
		}
	}
}