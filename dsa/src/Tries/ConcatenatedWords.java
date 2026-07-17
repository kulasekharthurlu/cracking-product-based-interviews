package Tries;

import java.util.*;

class TrieNode {
	TrieNode[] children = new TrieNode[26];
	boolean isEnd;
}

public class ConcatenatedWords {

	private TrieNode root = new TrieNode();

	public List<String> findAllConcatenatedWordsInADict(String[] words) {

		Arrays.sort(words, Comparator.comparingInt(String::length));

		List<String> result = new ArrayList<>();

		for (String word : words) {

			if (word.length() == 0) {
				continue;
			}

			if (canForm(word, 0, 0)) {
				result.add(word);
			} else {
				insert(word);
			}
		}

		return result;
	}

	private void insert(String word) {

		TrieNode current = root;

		for (char ch : word.toCharArray()) {

			int index = ch - 'a';

			if (current.children[index] == null) {
				current.children[index] = new TrieNode();
			}

			current = current.children[index];
		}

		current.isEnd = true;
	}

	private boolean canForm(String word, int index, int count) {

		if (index == word.length()) {
			return count >= 2;
		}

		TrieNode current = root;

		for (int i = index; i < word.length(); i++) {

			int child = word.charAt(i) - 'a';

			if (current.children[child] == null) {
				return false;
			}

			current = current.children[child];

			if (current.isEnd) {

				if (canForm(word, i + 1, count + 1)) {
					return true;
				}
			}
		}

		return false;
	}

	public static void main(String[] args) {

		String[] words = { "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat", "ratcatdogcat" };

		ConcatenatedWords solution = new ConcatenatedWords();

		System.out.println(solution.findAllConcatenatedWordsInADict(words));
	}
}