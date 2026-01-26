package com.day2.chatlogparser;

import java.util.*;

public class ChatAnalyzer {

	public static Map<String, List<String>> analyzeChats(List<ChatMessage> messages, MessageFilter<String> filter) {

		Map<String, List<String>> userMessages = new TreeMap<>();

		for (ChatMessage chat : messages) {

			if (!filter.allow(chat.getMessage())) {
				continue;
			}

			userMessages.computeIfAbsent(chat.getUser(), k -> new ArrayList<>()).add(chat.getMessage());
		}

		return userMessages;
	}
}