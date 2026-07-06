class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

public class LongestCommonPrefix {

    private TrieNode root = new TrieNode();

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        for (String word : strs) {
            insert(word);
        }

        StringBuilder prefix = new StringBuilder();
        TrieNode current = root;

        while (true) {

            int childCount = 0;
            int index = -1;

            for (int i = 0; i < 26; i++) {
                if (current.children[i] != null) {
                    childCount++;
                    index = i;
                }
            }

            if (childCount != 1 || current.isEnd) {
                break;
            }

            prefix.append((char) ('a' + index));
            current = current.children[index];
        }

        return prefix.toString();
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

    public static void main(String[] args) {

        LongestCommonPrefix obj = new LongestCommonPrefix();

        String[] words = {
                "flower",
                "flow",
                "flight"
        };

        System.out.println(
                obj.longestCommonPrefix(words)
        );
    }
}