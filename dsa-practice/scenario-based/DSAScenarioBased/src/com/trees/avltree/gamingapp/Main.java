package com.trees.avltree.gamingapp;

public class Main {

	public static void main(String[] args) {

		AVLTree leaderboard = new AVLTree();

		leaderboard.insert(1500, "Anupam");
		leaderboard.insert(1800, "Ravi");
		leaderboard.insert(1700, "Sneha");
		leaderboard.insert(2000, "Amit");
		leaderboard.insert(1600, "Neha");

		System.out.println("🏆 Top Players:");
		leaderboard.displayTopPlayers();

		System.out.println("\n❌ Removing player with score 1700");
		leaderboard.delete(1700);

		System.out.println("\n🏆 Updated Leaderboard:");
		leaderboard.displayTopPlayers();
	}
}
