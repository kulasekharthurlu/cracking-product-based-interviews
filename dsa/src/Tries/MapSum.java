class TrieNode {

    TrieNode[] children;
    int value;

    public TrieNode() {
        children = new TrieNode[26];
        value = 0;
    }
}

public class MapSum {

    private TrieNode root;

    public MapSum() {
        root = new TrieNode();
    }

    // Insert key-value pair
    public void insert(String key, int val) {

        TrieNode current = root;

        for (char ch : key.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                current.children[index] = new TrieNode();
            }

            current = current.children[index];
        }

        current.value = val;
    }

    // Return sum of values with given prefix
    public int sum(String prefix) {

        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {

            int index = ch - 'a';

            if (current.children[index] == null) {
                return 0;
            }

            current = current.children[index];
        }

        return dfs(current);
    }

    // DFS to calculate total value
    private int dfs(TrieNode node) {

        if (node == null) {
            return 0;
        }

        int total = node.value;

        for (TrieNode child : node.children) {
            total += dfs(child);
        }

        return total;
    }

    public static void main(String[] args) {

        MapSum mapSum = new MapSum();

        mapSum.insert("apple", 3);

        System.out.println(mapSum.sum("ap")); // 3

        mapSum.insert("app", 2);

        System.out.println(mapSum.sum("ap")); // 5

        mapSum.insert("april", 4);

        System.out.println(mapSum.sum("ap")); // 9
    }
}