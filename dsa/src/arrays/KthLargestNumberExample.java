package arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class KthLargestNumberExample {

    private static int kthLargestNumber(int[] arr, int k) {
        // Min-heap of size k
        Queue<Integer> queue = new PriorityQueue<>(k);

        for (int num : arr) {
            queue.offer(num);

            // Keep only k largest elements in the heap
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // The root of the min-heap is the kth largest element
        return queue.peek();
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int result = kthLargestNumber(arr, k);

        System.out.println(k + "th largest element is: " + result);
    }
}
