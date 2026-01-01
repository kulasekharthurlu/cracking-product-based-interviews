package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CheckArraySortedTest {

    @Test
    void shouldReturnTrueForNullArray() {
        assertTrue(ArrayUtil.checkArrayIsSorted(null));
    }

    @Test
    void shouldReturnTrueForEmptyArray() {
        assertTrue(ArrayUtil.checkArrayIsSorted(new int[]{}));
    }

    @Test
    void shouldReturnTrueForSingleElement() {
        assertTrue(ArrayUtil.checkArrayIsSorted(new int[]{10}));
    }

    @Test
    void shouldReturnTrueForAlreadySortedArray() {
        int[] arr = {1, 2, 3, 4, 5};
        assertTrue(ArrayUtil.checkArrayIsSorted(arr));
    }

    @Test
    void shouldReturnTrueForSortedWithDuplicates() {
        int[] arr = {1, 2, 2, 3, 4, 4};
        assertTrue(ArrayUtil.checkArrayIsSorted(arr));
    }

    @Test
    void shouldReturnFalseForUnsortedArray() {
        int[] arr = {1, 5, 3, 4, 2};
        assertFalse(ArrayUtil.checkArrayIsSorted(arr));
    }

    @Test
    void shouldReturnFalseForDescendingOrder() {
        int[] arr = {5, 4, 3, 2, 1};
        assertFalse(ArrayUtil.checkArrayIsSorted(arr));
    }
}
