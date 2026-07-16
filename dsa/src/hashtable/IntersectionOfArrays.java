package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IntersectionOfArrays {

	public static int[] intersection(int[] nums1, int[] nums2) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums1) {
			map.put(num, 1);
		}

		Set<Integer> resultSet = new HashSet<>();

		for (int num : nums2) {

			if (map.containsKey(num)) {
				resultSet.add(num);
			}
		}

		int[] result = new int[resultSet.size()];
		int index = 0;

		for (int num : resultSet) {
			result[index++] = num;
		}

		return result;
	}

	public static void main(String[] args) {

		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };

		System.out.println(Arrays.toString(intersection(nums1, nums2)));
	}
}