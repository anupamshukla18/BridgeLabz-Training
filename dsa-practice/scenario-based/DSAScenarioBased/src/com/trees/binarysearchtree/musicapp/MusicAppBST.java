package com.trees.binarysearchtree.musicapp;

import java.util.Scanner;

public class MusicAppBST {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		MusicBST bst = new MusicBST();

		System.out.print("Enter number of songs: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.print("\nEnter Track ID: ");
			int id = sc.nextInt();

			System.out.print("Enter Song Title: ");
			String title = sc.next();

			System.out.print("Enter Artist Name: ");
			String artist = sc.next();

			bst.root = bst.insert(bst.root, new Song(id, title, artist));
		}

		// 🔹 Scenario 1: Search Track
		System.out.print("\nEnter Track ID to search: ");
		int searchId = sc.nextInt();
		Song found = bst.searchByTrackId(bst.root, searchId);

		if (found != null)
			System.out.println("Found: " + found.title + " by " + found.artist);
		else
			System.out.println("Song not found");

		// 🔹 Scenario 3: Alphabetical Playlist
		System.out.println("\nPlaylist (Alphabetical Order):");
		bst.inorder(bst.root);

		sc.close();
	}
}