package com.day1.coderepocleaner;

import java.util.*;
import java.util.regex.*;

public class JavaFileAnalyzer {

	// camelCase method naming
	private static final Pattern METHOD_PATTERN = Pattern.compile("\\bvoid\\s+([A-Z][a-zA-Z0-9_]*)\\s*\\(");

	private static final Pattern IMPORT_PATTERN = Pattern.compile("^import\\s+([a-zA-Z0-9_.]+);", Pattern.MULTILINE);

	public static boolean hasBadMethodNames(String content) {
		Matcher matcher = METHOD_PATTERN.matcher(content);
		return matcher.find();
	}

	public static boolean hasUnusedImports(String content) {

		Matcher matcher = IMPORT_PATTERN.matcher(content);
		Set<String> imports = new HashSet<>();

		while (matcher.find()) {
			String imp = matcher.group(1);
			imports.add(imp.substring(imp.lastIndexOf('.') + 1));
		}

		for (String imp : imports) {
			if (!content.contains(imp + ".")) {
				return true; // unused import found
			}
		}
		return false;
	}
}