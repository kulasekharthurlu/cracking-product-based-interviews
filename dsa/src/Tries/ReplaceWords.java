import java.util.*;

class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

public class ReplaceWords {

    private TrieNode root;

    public ReplaceWords() {
        root = new TrieNode();
    }

    // Insert dictionary word into Trie
    public void insert(String word) {

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

    // Find shortest prefix
    public String findPrefix(String word) {

        TrieNode current = root;
        StringBuilder prefix = new StringBuilder();

        for (char ch : word.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return word;
            }

            prefix.append(ch);
            current = current.children[index];

            if (current.isEnd) {
                return prefix.toString();
            }
        }

        return word;
    }

    public String replaceWords(List<String> dictionary, String sentence) {

        for (String word : dictionary) {
            insert(word);
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(findPrefix(word)).append(" ");
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {

        ReplaceWords obj = new ReplaceWords();

        List<String> dictionary =
                Arrays.asList("cat", "bat", "rat");

        String sentence =
                "the cattle was rattled by the battery";

        System.out.println(
                obj.replaceWords(dictionary, sentence)
        );
    }
}