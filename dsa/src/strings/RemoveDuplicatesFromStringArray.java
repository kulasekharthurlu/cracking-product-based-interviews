package strings;

import java.util.*;

public class RemoveDuplicatesFromStringArray {

    public static String[] removeDuplicates(String[] arr) {
        Set<String> set = new LinkedHashSet<>();

        for (String s : arr) {
            set.add(s);
        }

        return set.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "apple", "orange", "banana"};

        String[] result = removeDuplicates(arr);

        System.out.println(Arrays.toString(result));
    }
}
