import java.util.*;

class TrieNode {

    TrieNode[] children = new TrieNode[26];
    boolean isEnd;
}

public class WordBreakII {

    private TrieNode root = new TrieNode();
    private Map<Integer, List<String>> memo = new HashMap<>();

    public List<String> wordBreak(String s, List<String> wordDict) {

        // Build Trie
        for (String word : wordDict) {
            insert(word);
        }

        return dfs(s, 0);
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

    private List<String> dfs(String s, int start) {

        if (memo.containsKey(start)) {
            return memo.get(start);
        }

        List<String> result = new ArrayList<>();

        if (start == s.length()) {
            result.add("");
            return result;
        }

        TrieNode current = root;

        for (int i = start; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (current.children[ch - 'a'] == null) {
                break;
            }

            current = current.children[ch - 'a'];

            if (current.isEnd) {

                String word = s.substring(start, i + 1);

                List<String> suffixes = dfs(s, i + 1);

                for (String suffix : suffixes) {

                    if (suffix.isEmpty()) {
                        result.add(word);
                    } else {
                        result.add(word + " " + suffix);
                    }
                }
            }
        }

        memo.put(start, result);

        return result;
    }

    public static void main(String[] args) {

        WordBreakII solution = new WordBreakII();

        String s = "catsanddog";

        List<String> dict = Arrays.asList(
                "cat",
                "cats",
                "and",
                "sand",
                "dog"
        );

        System.out.println(solution.wordBreak(s, dict));
    }
}