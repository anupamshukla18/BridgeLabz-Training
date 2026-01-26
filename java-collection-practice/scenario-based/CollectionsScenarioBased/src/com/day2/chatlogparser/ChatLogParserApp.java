package com.day2.chatlogparser;

import java.util.List;
import java.util.Map;

public class ChatLogParserApp {

	public static void main(String[] args) {

		String chatLogFilePath = "D:\\File Handling\\chatlog.txt";

		List<ChatMessage> messages = ChatLogReader.readChatFile(chatLogFilePath);

		MessageFilter<String> idleFilter = new IdleChatFilter();

		Map<String, List<String>> result = ChatAnalyzer.analyzeChats(messages, idleFilter);

		result.forEach((user, msgs) -> {
			System.out.println("\nUser: " + user);
			msgs.forEach(msg -> System.out.println("  - " + msg));
		});
	}
}