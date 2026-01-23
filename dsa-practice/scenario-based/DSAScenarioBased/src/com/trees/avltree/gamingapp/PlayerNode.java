package com.trees.avltree.gamingapp;

public class PlayerNode {
	int score;
	String player;
	int height;
	PlayerNode left, right;

	public PlayerNode(int score, String player) {
		this.score = score;
		this.player = player;
		this.height = 1;
	}
}
