package com.day1.feedbackguru;

import java.util.*;

public class FeedbackAnalyzer {

	public static <T> Map<String, List<Feedback<T>>> analyzeFeedback(List<String> feedbackLines, T feedbackType) {

		Map<String, List<Feedback<T>>> categorizedFeedback = new HashMap<>();

		categorizedFeedback.put("Positive", new ArrayList<>());
		categorizedFeedback.put("Neutral", new ArrayList<>());
		categorizedFeedback.put("Negative", new ArrayList<>());

		for (String line : feedbackLines) {

			try {
				int rating = RatingExtractor.extractRating(line);

				Feedback<T> feedback = new Feedback<>(feedbackType, line, rating);

				if (rating >= 8) {
					categorizedFeedback.get("Positive").add(feedback);
				} else if (rating >= 5) {
					categorizedFeedback.get("Neutral").add(feedback);
				} else {
					categorizedFeedback.get("Negative").add(feedback);
				}

			} catch (Exception e) {
				System.out.println("Invalid feedback skipped: " + line);
			}
		}
		return categorizedFeedback;
	}
}