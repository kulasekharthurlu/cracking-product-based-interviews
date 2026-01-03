package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class KthLargestNumberTest {

    @Test
    void shouldReturnNullForNullArray() {
        assertNull(KthLargestFinder.kthLargestNumber(null, 3));
    }

    @Test
    void shouldReturnNullForEmptyArray() {
        assertNull(KthLargestFinder.kthLargestNumber(new int[]{}, 1));
    }

    @Test
    void shouldReturnNullWhenKIsZero() {
        assertNull(KthLargestFinder.kthLargestNumber(new int[]{1, 2, 3}, 0));
    }

    @Test
    void shouldReturnNullWhenKGreaterThanLength() {
        assertNull(KthLargestFinder.kthLargestNumber(new int[]{1, 2, 3}, 5));
    }

    @Test
    void shouldFindLargestElementWhenKIsOne() {
        int[] arr = {7, 4, 6, 3, 9, 1};
        assertEquals(9, KthLargestFinder.kthLargestNumber(arr, 1));
    }

    @Test
    void shouldFindSecondLargest() {
        int[] arr = {7, 4, 6, 3, 9, 1};
        assertEquals(7, KthLargestFinder.kthLargestNumber(arr, 2));
    }

    @Test
    void shouldFindThirdLargest() {
        int[] arr = {7, 4, 6, 3, 9, 1};
        assertEquals(6, KthLargestFinder.kthLargestNumber(arr, 3));
    }

    @Test
    void shouldWorkWithDuplicates() {
        int[] arr = {5, 3, 5, 2, 1};
        assertEquals(5, KthLargestFinder.kthLargestNumber(arr, 2));
    }

    @Test
    void shouldWorkWithNegativeNumbers() {
        int[] arr = {-1, -10, -3, -4};
        assertEquals(-3, KthLargestFinder.kthLargestNumber(arr, 2));
    }
}
