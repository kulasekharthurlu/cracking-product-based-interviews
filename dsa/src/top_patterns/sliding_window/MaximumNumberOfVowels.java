public class MaximumNumberOfVowels{
public int maxVowels(String s, int k) {
    int count = 0, max = 0;

    for (int i = 0; i < k; i++) {
        if ("aeiou".indexOf(s.charAt(i)) != -1) count++;
    }
    max = count;

    for (int i = k; i < s.length(); i++) {
        if ("aeiou".indexOf(s.charAt(i)) != -1) count++;
        if ("aeiou".indexOf(s.charAt(i - k)) != -1) count--;
        max = Math.max(max, count);
    }
    return max;
}

}