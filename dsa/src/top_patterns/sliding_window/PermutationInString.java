public class PermutationInString{

public boolean checkInclusion(String s1, String s2) {
    int[] freq = new int[26];

    for (char c : s1.toCharArray()) freq[c - 'a']++;

    int left = 0;

    for (int right = 0; right < s2.length(); right++) {
        freq[s2.charAt(right) - 'a']--;

        while (freq[s2.charAt(right) - 'a'] < 0) {
            freq[s2.charAt(left) - 'a']++;
            left++;
        }

        if (right - left + 1 == s1.length()) return true;
    }
    return false;
}

}