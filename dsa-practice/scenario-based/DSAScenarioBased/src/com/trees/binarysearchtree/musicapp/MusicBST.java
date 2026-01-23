package com.trees.binarysearchtree.musicapp;

class MusicBST {

	Node root;

	// Insert song (BST based on TITLE)
	Node insert(Node root, Song song) {
		if (root == null)
			return new Node(song);

		if (song.title.compareToIgnoreCase(root.song.title) < 0)
			root.left = insert(root.left, song);
		else
			root.right = insert(root.right, song);

		return root;
	}

	// Search by Track ID (DFS)
	Song searchByTrackId(Node root, int trackId) {
		if (root == null)
			return null;

		if (root.song.trackId == trackId)
			return root.song;

		Song left = searchByTrackId(root.left, trackId);
		if (left != null)
			return left;

		return searchByTrackId(root.right, trackId);
	}

	// In-order Traversal (Alphabetical Playlist)
	void inorder(Node root) {
		if (root != null) {
			inorder(root.left);
			System.out.println(root.song.title + " | " + root.song.artist + " | ID: " + root.song.trackId);
			inorder(root.right);
		}
	}
}
