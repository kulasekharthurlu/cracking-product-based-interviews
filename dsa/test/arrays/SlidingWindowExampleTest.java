package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SlidingWindowExampleTest {

    @Test
    void testNormalCase() {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;

        int result = SlidingWindowExample.maxSumSubArray(arr, k);

        assertEquals(9, result);
    }

    @Test
    void testAnotherCase() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int result = SlidingWindowExample.maxSumSubArray(arr, k);

        assertEquals(9, result); // 4 + 5
    }

    @Test
    void testAllSameNumbers() {
        int[] arr = {5, 5, 5, 5};
        int k = 2;

        int result = SlidingWindowExample.maxSumSubArray(arr, k);

        assertEquals(10, result);
    }

    @Test
    void testKEqualsArrayLength() {
        int[] arr = {3, 1, 2};
        int k = 3;

        int result = SlidingWindowExample.maxSumSubArray(arr, k);

        assertEquals(6, result);
    }

    @Test
    void testSingleElementWindow() {
        int[] arr = {7, 2, 9, 1};
        int k = 1;

        int result = SlidingWindowExample.maxSumSubArray(arr, k);

        assertEquals(9, result);
    }
}
