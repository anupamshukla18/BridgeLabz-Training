package com.day2.chatlogparser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ChatLogReader {

	private static final Pattern CHAT_PATTERN = Pattern.compile("\\[(.*?)\\]\\s+(.*?):\\s+(.*)");

	public static List<ChatMessage> readChatFile(String filePath) {

		List<ChatMessage> messages = new ArrayList<>();

		try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

			String line;

			while ((line = reader.readLine()) != null) {

				Matcher matcher = CHAT_PATTERN.matcher(line);

				if (matcher.matches()) {
					messages.add(new ChatMessage(matcher.group(1), matcher.group(2), matcher.group(3)));
				}
			}

		} catch (Exception e) {
			System.out.println("Error reading chat log");
		}

		return messages;
	}
}