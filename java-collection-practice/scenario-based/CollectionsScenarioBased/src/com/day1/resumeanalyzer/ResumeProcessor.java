package com.day1.resumeanalyzer;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ResumeProcessor {
	public static List<ResumeData> processResume(String folderPath) {
		Map<String, ResumeData> resumeMap = new HashMap<String, ResumeData>();
		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null) {
			return new ArrayList<>();
		}

		for (File file : files) {
			try {
				if (!file.getName().endsWith(".txt")) {
					throw new InvalidResumeException("Unsupported file format");
				}

				String content = ResumeReader.readResume(file);
				String email = ResumeRegexUtil.extractEmail(content);
				if (email == null) {
					throw new InvalidResumeException("Email not found");
				}

				String phone = ResumeRegexUtil.extractPhone(content);
				int keywordCount = ResumeRegexUtil.countKeywords(content);

				ResumeData resumeData = new ResumeData(email, phone, keywordCount);
				resumeMap.put(email, resumeData);

			} catch (Exception e) {
				System.out.println("Skipped: " + file.getName());
			}
		}

		List<ResumeData> resumeList = new ArrayList<ResumeData>(resumeMap.values());
		resumeList.sort(new ResumeListComparator());

		return resumeList;
	}
}