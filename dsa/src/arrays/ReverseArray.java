package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] resultArray = reverseArray(arr);
		System.out.println(Arrays.toString(resultArray));
	}

	public static int[] reverseArray(int[] arr) {
		if (arr == null || arr.length == 0) {
			return new int[] {};
		}
		int start = 0;
		int end = arr.length - 1;
		while (start < end) {
			int temp = arr[start];
			arr[start++] = arr[end];
			arr[end--] = temp;
		}
		return arr;
	}
	public static int[] reverseArrayWithStreams(int[] arr) {

    if (arr == null || arr.length == 0) {
        return new int[]{};
    }

    return IntStream.range(0, arr.length)
            .map(i -> arr[arr.length - 1 - i])
            .toArray();
    }
}
