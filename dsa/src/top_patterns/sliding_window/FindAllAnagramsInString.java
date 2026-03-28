public class FindAllAnagramsInString{

public List<Integer> findAnagrams(String s, String p) {
    List<Integer> res = new ArrayList<>();
    int[] freq = new int[26];

    for (char c : p.toCharArray()) freq[c - 'a']++;

    int left = 0;

    for (int right = 0; right < s.length(); right++) {
        freq[s.charAt(right) - 'a']--;

        while (freq[s.charAt(right) - 'a'] < 0) {
            freq[s.charAt(left) - 'a']++;
            left++;
        }

        if (right - left + 1 == p.length()) {
            res.add(left);
        }
    }
    return res;
}


}