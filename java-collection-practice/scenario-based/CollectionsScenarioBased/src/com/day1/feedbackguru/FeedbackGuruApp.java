package com.day1.feedbackguru;

import java.util.List;
import java.util.Map;

public class FeedbackGuruApp {

	public static void main(String[] args) {

		String feedbackFolderPath = "D:\\File Handling\\Feedbacks";

		List<String> feedbackLines = FeedbackReader.readFeedbackFiles(feedbackFolderPath);

		Map<String, List<Feedback<String>>> result = FeedbackAnalyzer.analyzeFeedback(feedbackLines, "Service");

		result.forEach((category, feedbackList) -> {
			System.out.println("\n" + category + " Feedback:");
			feedbackList.forEach(f -> System.out.println(f.getMessage()));
		});
	}
}