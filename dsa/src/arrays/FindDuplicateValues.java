package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class FindDuplicateValues {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 1, 2, 5, 9 };
		var result = findDuplicateValuesCount(arr);

	}

	public static List<Integer> findDuplicateValuesCount(int[] arr) {
		if (arr == null || arr.length == 0) {
			return Collections.emptyList();
		}
		HashSet<Integer> seen = new HashSet<Integer>();
		HashSet<Integer> duplicates = new HashSet<Integer>();
		for (int i : arr) {
			if (!seen.add(i)) {
				duplicates.add(i);
			}
		}

		return new ArrayList<>(duplicates);
	}
}
