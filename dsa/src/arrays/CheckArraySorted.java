package arrays;

import java.util.stream.IntStream;

public class CheckArraySorted {

    public static boolean checkArrayIsSorted(int[] arr) {

        if (arr == null || arr.length < 2) {
            return true;   // Single element or empty array is always sorted
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }
    public static boolean checkArrayIsSortedWithStreams(int[] arr) {

    if (arr == null || arr.length < 2) {
        return true;
    }

    return IntStream.range(1, arr.length)
            .allMatch(i -> arr[i - 1] <= arr[i]);
}

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 3, 1, 4};

        System.out.println("Array1 sorted? " + checkArrayIsSorted(arr1));
        System.out.println("Array2 sorted? " + checkArrayIsSorted(arr2));
    }
}
