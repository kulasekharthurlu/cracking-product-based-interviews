package arrays;

public class FindMissingNumber {

    private static int findMissingNumber(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] + 1 != arr[i + 1]) {
                return arr[i] + 1;
            }
        }
        return -1;
    }
    private static int findMissingNumberWithStream(int[] arr) {

        if (arr == null || arr.length < 2) {
            return -1;
        }
    int n = arr.length + 1;

    int expectedSum = IntStream.rangeClosed(1, n).sum();

    int actualSum = Arrays.stream(arr).sum();

    return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 6, 7, 8};

        int missing = findMissingNumber(arr);

        System.out.println("Missing Number: " + missing);
    }
}
