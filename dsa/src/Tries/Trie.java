package Tries;

public class Trie {

	private TrieNode root;

	public Trie() {
		root = new TrieNode(); // root is empty
	}

	private class TrieNode {
		private TrieNode[] children;
		private boolean isWord;

		public TrieNode() {
			this.children = new TrieNode[26]; // storing english words - a -> z this.isWord = false;
		}
	}

	public void insert(String word) {
		if (word == null || word.isEmpty()) {
			throw new IllegalArgumentException("Invalid input");
		}
		word = word.toLowerCase();
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char c = word.charAt(i);
			int index = c - 'a';
			if (current.children[index] == null) {
				TrieNode node = new TrieNode();
				current.children[index] = node;
				current = node;
			} else {
				current = current.children[index];
			}
		}
		current.isWord = true;

	}

	public boolean search(String word) {
    if (word == null || word.isEmpty()) {
        return false;
    }

    word = word.toLowerCase();
    TrieNode current = root;

    for (int i = 0; i < word.length(); i++) {
        char c = word.charAt(i);
        int index = c - 'a';

        if (current.children[index] == null) {
            return false;
        }

        current = current.children[index];
    }

    return current.isWord;
}

public boolean startsWith(String prefix) {
    if (prefix == null || prefix.isEmpty()) {
        return false;
    }

    prefix = prefix.toLowerCase();
    TrieNode current = root;

    for (int i = 0; i < prefix.length(); i++) {
        char c = prefix.charAt(i);
        int index = c - 'a';

        if (current.children[index] == null) {
            return false;
        }

        current = current.children[index];
    }

    return true;
}

public void delete(String word) {
    if (word == null || word.isEmpty()) {
        throw new IllegalArgumentException("Invalid input");
    }

    delete(root, word.toLowerCase(), 0);
}

private boolean delete(TrieNode current, String word, int index) {

    // Base case: reached end of word
    if (index == word.length()) {
        if (!current.isWord) {
            return false; // word not present
        }

        current.isWord = false;

        // if node has no children, it can be deleted
        return isEmpty(current);
    }

    char c = word.charAt(index);
    int childIndex = c - 'a';
    TrieNode node = current.children[childIndex];

    if (node == null) {
        return false; // word not found
    }

    boolean shouldDeleteCurrentNode = delete(node, word, index + 1);

    if (shouldDeleteCurrentNode) {
        current.children[childIndex] = null;
        return !current.isWord && isEmpty(current);
    }

    return false;
}

private boolean isEmpty(TrieNode node) {
    for (TrieNode child : node.children) {
        if (child != null) {
            return false;
        }
    }
    return true;
}

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("cat");
		trie.insert("cab");
		trie.insert("son");
		trie.insert("so");
		System.out.println("Values inserted successfully !!!");
	}
}
