package com.day2.songvault;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SongFileReader {

	private static final Pattern TITLE_PATTERN = Pattern.compile("Title:\\s*(.*)");
	private static final Pattern ARTIST_PATTERN = Pattern.compile("Artist:\\s*(.*)");
	private static final Pattern DURATION_PATTERN = Pattern.compile("Duration:\\s*(.*)");
	private static final Pattern GENRE_PATTERN = Pattern.compile("Genre:\\s*(.*)");

	public static List<Song> readSongs(String folderPath) {

		List<Song> songs = new ArrayList<>();
		File folder = new File(folderPath);
		File[] files = folder.listFiles();

		if (files == null)
			return songs;

		for (File file : files) {

			if (!file.getName().endsWith(".txt"))
				continue;

			try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

				String title = null, artist = null, duration = null, genre = null;
				String line;

				while ((line = reader.readLine()) != null) {

					Matcher m;

					m = TITLE_PATTERN.matcher(line);
					if (m.matches())
						title = m.group(1);

					m = ARTIST_PATTERN.matcher(line);
					if (m.matches())
						artist = m.group(1);

					m = DURATION_PATTERN.matcher(line);
					if (m.matches())
						duration = m.group(1);

					m = GENRE_PATTERN.matcher(line);
					if (m.matches())
						genre = m.group(1);
				}

				if (title != null && artist != null) {
					songs.add(new Song(title, artist, duration, genre));
				}

			} catch (Exception e) {
				System.out.println("Skipped file: " + file.getName());
			}
		}
		return songs;
	}
}