package com.day2.songvault;

import java.util.*;
import java.util.stream.Collectors;

public class SongAnalyzer {

	public static Map<String, List<Song>> groupByGenre(List<Song> songs) {

		return songs.stream().collect(Collectors.groupingBy(Song::getGenre));
	}

	public static Set<String> getUniqueArtists(List<Song> songs) {

		return songs.stream().map(Song::getArtist).collect(Collectors.toSet());
	}

	public static List<Song> sortByTitle(List<Song> songs) {

		return songs.stream().sorted(Comparator.comparing(Song::getTitle)).toList();
	}
}