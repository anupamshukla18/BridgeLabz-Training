package com.day2.chatlogparser;

import java.util.List;

public class IdleChatFilter implements MessageFilter<String> {

	private final List<String> idleKeywords = List.of("lol", "brb", "haha", "ok bro");

	@Override
	public boolean allow(String message) {

		String lowerMessage = message.toLowerCase();

		for (String keyword : idleKeywords) {
			if (lowerMessage.contains(keyword)) {
				return false;
			}
		}
		return true;
	}
}