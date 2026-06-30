class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEndOfWord;
}

public class Trie {

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert
    public void insert(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.isEndOfWord = true;
    }

    // Search
    public boolean search(String word) {

        TrieNode current = root;

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return false;
            }

            current = current.children[index];
        }

        return current.isEndOfWord;
    }

    // Delete
    public void delete(String word) {
        delete(root, word, 0);
    }

    private boolean delete(TrieNode current, String word, int depth) {

        if (current == null) {
            return false;
        }

        // Last character reached
        if (depth == word.length()) {

            if (!current.isEndOfWord) {
                return false;
            }

            current.isEndOfWord = false;

            return hasNoChildren(current);
        }

        int index = word.charAt(depth) - 'a';

        if (delete(current.children[index], word, depth + 1)) {

            current.children[index] = null;

            return !current.isEndOfWord && hasNoChildren(current);
        }

        return false;
    }

    private boolean hasNoChildren(TrieNode node) {

        for (TrieNode child : node.children) {

            if (child != null) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        System.out.println(trie.search("apple")); // true
        System.out.println(trie.search("app"));   // true

        trie.delete("apple");

        System.out.println(trie.search("apple")); // false
        System.out.println(trie.search("app"));   // true
        System.out.println(trie.search("bat"));   // true
    }
}