import java.util.*;

class TrieNode {
    TrieNode[] children = new TrieNode[26];
    List<String> words = new ArrayList<>();
}

public class WordSquares {

    private TrieNode root = new TrieNode();

    public List<List<String>> wordSquares(String[] words) {

        for (String word : words) {
            insert(word);
        }

        List<List<String>> result = new ArrayList<>();

        for (String word : words) {
            List<String> square = new ArrayList<>();
            square.add(word);
            backtrack(words[0].length(), square, result);
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
            current.words.add(word);
        }
    }

    private void backtrack(int length,
                           List<String> square,
                           List<List<String>> result) {

        if (square.size() == length) {
            result.add(new ArrayList<>(square));
            return;
        }

        int index = square.size();

        StringBuilder prefix = new StringBuilder();

        for (String word : square) {
            prefix.append(word.charAt(index));
        }

        List<String> candidates = search(prefix.toString());

        for (String candidate : candidates) {
            square.add(candidate);
            backtrack(length, square, result);
            square.remove(square.size() - 1);
        }
    }

    private List<String> search(String prefix) {

        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return new ArrayList<>();
            }

            current = current.children[index];
        }

        return current.words;
    }

    public static void main(String[] args) {

        String[] words = {
                "ball",
                "area",
                "lead",
                "lady"
        };

        WordSquares solution = new WordSquares();

        List<List<String>> result =
                solution.wordSquares(words);

        for (List<String> square : result) {
            System.out.println(square);
        }
    }
}