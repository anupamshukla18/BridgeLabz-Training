package com.day1.feedbackguru;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RatingExtractor {

	private static final Pattern RATING_PATTERN = Pattern.compile("(\\d{1,2})/10");

	public static int extractRating(String feedbackLine) {

		Matcher matcher = RATING_PATTERN.matcher(feedbackLine);

		if (matcher.find()) {
			return Integer.parseInt(matcher.group(1));
		}
		throw new IllegalArgumentException("Rating not found");
	}
}