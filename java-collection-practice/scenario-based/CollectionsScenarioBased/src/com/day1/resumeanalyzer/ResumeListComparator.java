package com.day1.resumeanalyzer;

import java.util.Comparator;

public class ResumeListComparator implements Comparator<ResumeData> {

	@Override
	public int compare(ResumeData r1, ResumeData r2) {
		return r2.getKeywordMatchCount() - r1.getKeywordMatchCount();
	}

}