package arrays;

import java.util.HashMap;
import java.util.Arrays;

public class RotateArray {

    // Right Rotation
    public static int[] rotateRight(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr;

        k = k % n;
        HashMap<Integer, Integer> map = new HashMap<>();

        // store rotated positions
        for (int i = 0; i < n; i++) {
            int newIndex = (i + k) % n;
            map.put(newIndex, arr[i]);
        }

        // write back into array
        for (int i = 0; i < n; i++) {
            arr[i] = map.get(i);
        }

        return arr;
    }

    // Left Rotation
    public static int[] rotateLeft(int[] arr, int k) {
        int n = arr.length;
        if (n == 0) return arr;

        k = k % n;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int newIndex = (i - k + n) % n;
            map.put(newIndex, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            arr[i] = map.get(i);
        }

        return arr;
    }

   
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println("Original: " + Arrays.toString(arr1));

        rotateRight(arr1, 2);
        System.out.println("Right Rotated by 2: " + Arrays.toString(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        rotateLeft(arr2, 2);
        System.out.println("Left Rotated by 2: " + Arrays.toString(arr2));
    }
}
