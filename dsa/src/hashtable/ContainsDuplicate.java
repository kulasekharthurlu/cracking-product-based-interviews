package hashtable;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {

	public boolean containsDuplicate(int[] nums) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int num : nums) {

			if (map.containsKey(num)) {
				return true;
			}

			map.put(num, 1);
		}

		return false;
	}

	public static void main(String[] args) {

		ContainsDuplicate solution = new ContainsDuplicate();

		int[] nums1 = { 1, 2, 3, 1 };
		int[] nums2 = { 1, 2, 3, 4 };

		System.out.println(solution.containsDuplicate(nums1)); // true
		System.out.println(solution.containsDuplicate(nums2)); // false
	}
}