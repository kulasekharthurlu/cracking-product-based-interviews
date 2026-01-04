package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static arrays.CheckArraySorted.*;

class CheckArraySortedTest {

    @Test
    void shouldReturnTrueForNullArray() {
        assertTrue(checkArrayIsSorted(null));
    }

    @Test
    void shouldReturnTrueForEmptyArray() {
        assertTrue(checkArrayIsSorted(new int[]{}));
    }

    @Test
    void shouldReturnTrueForSingleElement() {
        assertTrue(checkArrayIsSorted(new int[]{10}));
    }

    @Test
    void shouldReturnTrueForAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertTrue(checkArrayIsSorted(arr));
    }

    @Test
    void shouldReturnTrueForSortedWithDuplicates() {
        int[] arr = {1, 2, 2, 3, 4, 4};
        assertTrue(checkArrayIsSorted(arr));
    }

    @Test
    void shouldReturnFalseForUnsortedArray() {
        int[] arr = {1, 5, 3, 4, 2};
        assertFalse(checkArrayIsSorted(arr));
    }

    @Test
    void shouldReturnFalseForDescendingOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        assertFalse(checkArrayIsSorted(arr));
    }
}
