package com.day2.examresultuploader;

import java.util.*;

public class ResultAnalyzer {

	public static Map<String, List<Integer>> groupMarksBySubject(List<ExamRecord<ExamType>> records) {

		Map<String, List<Integer>> subjectMarksMap = new HashMap<>();

		for (ExamRecord<?> record : records) {

			subjectMarksMap.computeIfAbsent(record.getSubject(), k -> new ArrayList<>()).add(record.getMarks());
		}

		return subjectMarksMap;
	}

	public static Map<String, Integer> findTopperPerSubject(Map<String, List<Integer>> subjectMarksMap) {

		Map<String, Integer> toppers = new HashMap<>();

		for (Map.Entry<String, List<Integer>> entry : subjectMarksMap.entrySet()) {

			PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

			maxHeap.addAll(entry.getValue());
			toppers.put(entry.getKey(), maxHeap.peek());
		}

		return toppers;
	}
}