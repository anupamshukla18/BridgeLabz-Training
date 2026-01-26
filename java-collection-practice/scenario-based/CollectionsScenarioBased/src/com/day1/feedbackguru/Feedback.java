package com.day1.feedbackguru;

public class Feedback<T> {

	private T feedbackType; // Product / Service / Any future type
	private String message;
	private int rating;

	public Feedback(T feedbackType, String message, int rating) {
		this.feedbackType = feedbackType;
		this.message = message;
		this.rating = rating;
	}

	public T getFeedbackType() {
		return feedbackType;
	}

	public String getMessage() {
		return message;
	}

	public int getRating() {
		return rating;
	}
}