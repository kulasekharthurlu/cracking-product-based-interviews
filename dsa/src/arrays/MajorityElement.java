package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
public class MajorityElement {

    public static int findMajorityElement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        Map<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);

            // Early exit when majority is found
            if (map.get(num) > arr.length / 2) {
                return num;
            }
        }
        return -1; // No majority element
    }
    public static int findMajorityElementWithStreams(int[] arr) {

    if (arr == null || arr.length == 0) {
        return -1;
    }

    return Arrays.stream(arr)
            .boxed()
            .collect(Collectors.groupingBy(
                    Function.identity(),
                    Collectors.counting()
            ))
            .entrySet()
            .stream()
            .filter(e -> e.getValue() > arr.length / 2)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(-1);
}

    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};

        int result = findMajorityElement(arr);

        if (result != -1) {
            System.out.println("Majority Element: " + result);
        } else {
            System.out.println("No Majority Element found");
        }
    }
}
