class TrieNode {

    TrieNode[] children = new TrieNode[2];
}

public class MaximumXOR {

    private TrieNode root;

    public MaximumXOR() {
        root = new TrieNode();
    }

    // Insert a number into the Binary Trie
    private void insert(int num) {

        TrieNode current = root;

        for (int i = 31; i >= 0; i--) {

            int bit = (num >> i) & 1;

            if (current.children[bit] == null) {
                current.children[bit] = new TrieNode();
            }

            current = current.children[bit];
        }
    }

    // Find maximum XOR for a given number
    private int findMaxXOR(int num) {

        TrieNode current = root;
        int maxXor = 0;

        for (int i = 31; i >= 0; i--) {

            int bit = (num >> i) & 1;
            int oppositeBit = 1 - bit;

            if (current.children[oppositeBit] != null) {

                maxXor |= (1 << i);
                current = current.children[oppositeBit];

            } else {

                current = current.children[bit];
            }
        }

        return maxXor;
    }

    public int findMaximumXOR(int[] nums) {

        for (int num : nums) {
            insert(num);
        }

        int result = 0;

        for (int num : nums) {
            result = Math.max(result, findMaxXOR(num));
        }

        return result;
    }

    public static void main(String[] args) {

        MaximumXOR solution = new MaximumXOR();

        int[] nums = {3, 10, 5, 25, 2, 8};

        System.out.println(solution.findMaximumXOR(nums));
    }
}