package day11.hackerrankproblems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterIslands{
	static class SubString {

		int parentStart;
		int start;
		int length;
		char character;

		int islands;
		int size;

		int[] positions;

		SubString(int parentStart, int start, char character, int length, int capacity) {

			this.parentStart = parentStart;
			this.start = start;
			this.character = character;
			this.length = length;

			positions = new int[Math.max(2, capacity + 1)];
		}

		void addPosition(int position) {

			// A new island begins if there is a gap
			// between the previous occurrence and this one.
			if (size == 0 || positions[size - 1] + length < position) {

				islands++;
			}

			if (size == positions.length) {

				int[] newArray = new int[positions.length * 2];

				System.arraycopy(positions, 0, newArray, 0, positions.length);

				positions = newArray;
			}

			positions[size++] = position;
		}
	}

	static class LetterIslandSolver {

		char[] text;
		int requiredIslands;

		Map<Long, SubString> current;
		Map<Long, SubString> next;

		SubString previousSubstring;
		int previousParent = -1;
		int previousLength = -1;
		char previousCharacter;

		LetterIslandSolver(String s, int k) {

			text = s.toCharArray();
			requiredIslands = k;

			current = new HashMap<>();
			next = new HashMap<>();
		}

		long makeKey(int parentStart, int length, char character) {

			return ((long) parentStart) | ((long) length << 31) | ((long) character << 23);
		}

		long makeKey(int length, char character) {

			return ((long) length << 31) | ((long) character << 23);
		}

		long makeKey(char character) {

			return ((long) character << 23);
		}

		void addSingleCharacter(int start, char character) {

			long key = makeKey(character);

			SubString sub = next.get(key);

			if (sub == null) {

				sub = new SubString(-1, start, character, 1, 16);

				next.put(key, sub);
			}

			sub.addPosition(start);
		}

		void addRepeatedCharacter(int start, char character, int length) {

			long key = makeKey(length, character);

			SubString sub = next.get(key);

			if (sub == null) {

				sub = new SubString(-1, start, character, length, 16);

				next.put(key, sub);
			}

			sub.addPosition(start);
		}

		void addExtendedSubstring(int parentStart, int start, char character, int length, int expectedCapacity) {

			if (previousParent != parentStart || previousLength != length || previousCharacter != character) {

				long key = makeKey(parentStart, length, character);

				previousSubstring = next.get(key);

				if (previousSubstring == null) {

					previousSubstring = new SubString(parentStart, start, character, length, expectedCapacity);

					next.put(key, previousSubstring);
				}

				previousParent = previousSubstring.parentStart;

				previousLength = length;
				previousCharacter = previousSubstring.character;
			}

			previousSubstring.addPosition(start);
		}

		void switchLists() {

			previousSubstring = null;
			previousParent = -1;
			previousLength = -1;

			Map<Long, SubString> temporary = current;

			current = next;
			next = temporary;

			next.clear();
		}

		long solve() {

			long answer = 0;

			/*
			 * First generate all distinct one-character substrings.
			 *
			 * We also handle repeated occurrences efficiently.
			 */
			char previousCharacter = text[0];
			int repeatedCount = 0;

			for (int i = 0; i <= text.length; i++) {

				if (i == text.length || text[i] != previousCharacter) {

					if (repeatedCount > 1) {

						for (int start = i - repeatedCount; start < i - 1; start++) {

							addRepeatedCharacter(start, previousCharacter, i - start);
						}
					}

					addSingleCharacter(i - 1, previousCharacter);

					if (i != text.length) {

						previousCharacter = text[i];

						repeatedCount = 1;
					}

				} else {

					repeatedCount++;
				}
			}

			switchLists();

			/*
			 * Extend substrings one character at a time.
			 */
			while (!current.isEmpty()) {

				for (SubString sub : current.values()) {

					/*
					 * We found a substring having exactly k islands.
					 */
					if (sub.islands == requiredIslands) {

						answer++;

						/*
						 * Special optimization for k = 1 and a one-character substring.
						 */
						if (requiredIslands == 1 && sub.length == 1) {

							answer += text.length - sub.start - sub.length;

							continue;
						}

					} else if (sub.size < requiredIslands) {

						/*
						 * It cannot possibly reach k islands by extending this substring.
						 */
						continue;
					}

					/*
					 * Extend every occurrence by one character.
					 */
					for (int i = 0; i < sub.size; i++) {

						int start = sub.positions[i];

						if (start >= text.length - sub.length) {

							break;
						}

						int nextPosition = start + sub.length;

						char nextCharacter = text[nextPosition];

						addExtendedSubstring(sub.start, start, nextCharacter, sub.length + 1, sub.size);
					}
				}

				switchLists();
			}

			return answer;
		}
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String inputString = scanner.next();

		int numberOfIslands = scanner.nextInt();

		if (inputString.length() == 0 || numberOfIslands <= 0 || numberOfIslands > inputString.length()) {

			System.out.println(0);

			scanner.close();
			return;
		}

		LetterIslandSolver solver = new LetterIslandSolver(inputString, numberOfIslands);

		System.out.println(solver.solve());

		scanner.close();
	}
}