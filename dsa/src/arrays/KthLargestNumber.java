package arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestNumber {

	public static int kthLargestNumber(int[] arr, int k) {
		Queue<Integer> queue = new PriorityQueue<>(k);
		for (int num : arr) {
			queue.offer(num);
			if (queue.size() > k) {
				queue.poll();
			}
		}
		return queue.peek();
	}
	public static int kthLargestNumberWithStreams(int[] arr, int k) {

    if (arr == null || arr.length < k || k <= 0) {
        throw new IllegalArgumentException("Invalid input");
    }

    return Arrays.stream(arr)
            .boxed()
            .sorted((a, b) -> b - a)   // descending order
            .skip(k - 1)
            .findFirst()
            .orElseThrow();
}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 5, 6, 4 };
		int k = 2;
		int result = kthLargestNumber(arr, k);
		System.out.println(k + "th largest element is: " + result);
	}
}
