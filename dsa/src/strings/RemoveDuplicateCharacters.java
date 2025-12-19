package strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

    public static String removeDuplicates(String str) {
        if (str == null || str.isEmpty()) return str;

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (set.add(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming")); // progamin
        System.out.println(removeDuplicates("aabbcc"));      // abc
    }
}
