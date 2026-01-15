package com.examproctor;

import java.util.HashMap;

// This class stores answers using HashMap
public class AnswerStore {

	private HashMap<Integer, String> answers = new HashMap<>();

	// Saves answer for a question
	public void saveAnswer(int questionId, String answer) {
		answers.put(questionId, answer.toUpperCase());
	}

	// Returns all saved answers
	public HashMap<Integer, String> getAnswers() {
		return answers;
	}
}
