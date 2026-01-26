package com.day1.examscanner;

import java.util.List;

public class AnswerSheet<T> {
	protected List<T> answers;

	public AnswerSheet(List<T> answers) {
		this.answers = answers;
	}

	public List<T> getAnswers() {
		return answers;
	}
}