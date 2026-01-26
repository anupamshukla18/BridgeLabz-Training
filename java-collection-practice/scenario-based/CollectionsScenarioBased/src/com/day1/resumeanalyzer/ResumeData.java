package com.day1.resumeanalyzer;

public class ResumeData {

	private String email;
	private String phone;
	private int keywordMatchCount;

	public ResumeData(String email, String phone, int keywordMatchCount) {
		this.email = email;
		this.phone = phone;
		this.keywordMatchCount = keywordMatchCount;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

	public int getKeywordMatchCount() {
		return keywordMatchCount;
	}

	@Override
	public String toString() {
		return "Email: " + this.email + ", Phone: " + this.phone + ", keyword matches: " + this.keywordMatchCount;
	}

}