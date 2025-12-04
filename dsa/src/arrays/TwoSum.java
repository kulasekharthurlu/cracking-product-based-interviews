package arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
	public static void main(String[] args) {
		int[] a = { 11, 18, 19, 21, 23 };
		int target = 30;
		int[] returnValue = twoSum(a, target);
		System.out.println(Arrays.toString(returnValue));
	}

	public static int[] twoSum(int[] inputArray, int target) {
		if(inputArray == null || inputArray.length == 0) {
			return new int[] {-1,-1};
		}
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < inputArray.length; i++) {
			if (hashMap.containsKey(target - inputArray[i])) {
				return new int[] { hashMap.get(target - inputArray[i]),i};
			}
			hashMap.put(inputArray[i], i);
		}
		return new int[] { -1, -1 };
	}
	
}
