package com.day1.examscanner;

public class StudentResult {
	private String name;
	private int score;

	public StudentResult(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public int getScore() {
		return score;
	}

	@Override
	public String toString() {
		return name + " -> Score: " + score;
	}
}