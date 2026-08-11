package day8.hackerrankproblems;

import java.util.*;

class CrosswordPuzzle {
	static boolean solve(char[][] board, String[] words, int index) {
		// All words placed
		if (index == words.length) {
			return true;
		}

		String word = words[index];

		// Try every position
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 10; col++) {

				// Horizontal
				if (canPlaceHorizontal(board, word, row, col)) {

					boolean[] placed = placeHorizontal(board, word, row, col);

					if (solve(board, words, index + 1)) {
						return true;
					}

					// Backtrack
					removeHorizontal(board, word, row, col, placed);
				}

				// Vertical
				if (canPlaceVertical(board, word, row, col)) {

					boolean[] placed = placeVertical(board, word, row, col);

					if (solve(board, words, index + 1)) {
						return true;
					}

					// Backtrack
					removeVertical(board, word, row, col, placed);
				}
			}
		}

		return false;
	}

	static boolean canPlaceHorizontal(char[][] board, String word, int row, int col) {
		if (col + word.length() > 10)
			return false;

		if (col > 0 && board[row][col - 1] != '+')
			return false;

		if (col + word.length() < 10 && board[row][col + word.length()] != '+')
			return false;

		for (int i = 0; i < word.length(); i++) {

			char current = board[row][col + i];

			if (current != '-' && current != word.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	static boolean canPlaceVertical(char[][] board, String word, int row, int col) {
		if (row + word.length() > 10)
			return false;

		if (row > 0 && board[row - 1][col] != '+')
			return false;

		if (row + word.length() < 10 && board[row + word.length()][col] != '+') {
			return false;
		}

		for (int i = 0; i < word.length(); i++) {

			char current = board[row + i][col];

			if (current != '-' && current != word.charAt(i)) {
				return false;
			}
		}

		return true;
	}

	static boolean[] placeHorizontal(char[][] board, String word, int row, int col) {
		boolean[] placed = new boolean[word.length()];

		for (int i = 0; i < word.length(); i++) {

			if (board[row][col + i] == '-') {
				board[row][col + i] = word.charAt(i);
				placed[i] = true;
			}
		}

		return placed;
	}

	static boolean[] placeVertical(char[][] board, String word, int row, int col) {
		boolean[] placed = new boolean[word.length()];

		for (int i = 0; i < word.length(); i++) {

			if (board[row + i][col] == '-') {
				board[row + i][col] = word.charAt(i);
				placed[i] = true;
			}
		}

		return placed;
	}

	static void removeHorizontal(char[][] board, String word, int row, int col, boolean[] placed) {

		for (int i = 0; i < word.length(); i++) {

			if (placed[i]) {
				board[row][col + i] = '-';
			}
		}
	}

	static void removeVertical(char[][] board, String word, int row, int col, boolean[] placed) {
		for (int i = 0; i < word.length(); i++) {

			if (placed[i]) {
				board[row + i][col] = '-';
			}
		}
	}

	public static List<String> crosswordPuzzle(List<String> crossword, String words) {
		char[][] board = new char[10][10];

		// Convert List<String> to char[][]
		for (int i = 0; i < 10; i++) {
			board[i] = crossword.get(i).toCharArray();
		}

		String[] wordList = words.split(";");

		// Start recursion
		solve(board, wordList, 0);

		// Convert char[][] back to List<String>
		List<String> result = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			result.add(new String(board[i]));
		}

		return result;
	}
}