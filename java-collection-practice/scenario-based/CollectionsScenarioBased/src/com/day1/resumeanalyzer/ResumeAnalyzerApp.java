package com.day1.resumeanalyzer;

import java.util.List;

public class ResumeAnalyzerApp {
	public static void main(String[] args) {
		String resumeFolderPath = "D:\\File Handling\\ResumeAnalyzer";
		List<ResumeData> resumeList = ResumeProcessor.processResume(resumeFolderPath);

		for (ResumeData resume : resumeList) {
			System.out.println(resume);
		}
	}
}