package arrays;

public class SlidingWindowExample {

    public static int maxSumSubArray(int[] arr, int k) {

        int windowSum = 0;
        int maxSum = 0;

        for (int i = 0; i < arr.length; i++) {

            windowSum += arr[i];

            // when window size reaches k
            if (i >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[i - (k - 1)]; // slide window
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = maxSumSubArray(arr, k);

        System.out.println("Maximum sum of subarray size " + k + " is: " + result);
    }
}
