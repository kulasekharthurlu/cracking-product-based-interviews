package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateNumber {

	public static int findDuplicateNumber(int[] arr) {
		Set<Integer> seen = new HashSet<>();

		for (int num : arr) {
			if (!seen.add(num)) {
				return num;
			}
		}
		return -1;
	}

	public static int findDuplicateStream(int[] arr) {
		return Arrays.stream(arr)
				.boxed()
				.collect(Collectors.groupingBy(n -> n, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(e -> e.getValue() > 1)
				.map(Map.Entry::getKey)
				.findFirst()
                .orElse(-1);
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 4, 2, 5, 3 };

		int duplicate = findDuplicateNumber(arr);

		if (duplicate != -1) {
			System.out.println("Duplicate number is: " + duplicate);
		} else {
			System.out.println("No duplicate found");
		}
	}
}
