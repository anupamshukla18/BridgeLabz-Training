package com.day2.songvault;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class SongVaultApp {

	public static void main(String[] args) {

		String songFolderPath = "D:\\File Handling\\songs";

		List<Song> songs = SongFileReader.readSongs(songFolderPath);

		System.out.println("All Songs:");
		songs.forEach(System.out::println);

		System.out.println("\nUnique Artists:");
		Set<String> artists = SongAnalyzer.getUniqueArtists(songs);
		artists.forEach(System.out::println);

		System.out.println("\nSongs Grouped by Genre:");
		Map<String, List<Song>> byGenre = SongAnalyzer.groupByGenre(songs);
		byGenre.forEach((genre, songList) -> {
			System.out.println("\n" + genre);
			songList.forEach(System.out::println);
		});

		System.out.println("\nSongs Sorted by Title:");
		SongAnalyzer.sortByTitle(songs).forEach(System.out::println);
	}
}