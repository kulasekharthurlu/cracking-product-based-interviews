package arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

class SecondLargestFinderTest {

    @Test
    void shouldReturnNullForNullArray() {
        assertNull(SecondLargestNumber.findSecondLargest(null));
    }

    @Test
    void shouldReturnNullForSingleElement() {
        assertNull(SecondLargestNumber.findSecondLargest(new int[]{10}));
    }

    @Test
    void shouldReturnSecondLargestNormally() {
        int[] arr = {10, 5, 20, 8};
        assertEquals(10, SecondLargestNumber.findSecondLargest(arr));
    }

    @Test
    void shouldReturnSecondLargestWithNegatives() {
        int[] arr = {-10, -5, -1, -20};
        assertEquals(-5, SecondLargestNumber.findSecondLargest(arr));
    }

    @Test
    void shouldReturnNullIfAllValuesSame() {
        int[] arr = {5, 5, 5, 5};
        assertNull(SecondLargestNumber.findSecondLargest(arr));
    }

    @Test
    void shouldWorkWithDuplicates() {
        int[] arr = {4, 6, 6, 2};
        assertEquals(4, SecondLargestNumber.findSecondLargest(arr));
    }

    @Test
    void shouldWorkWithDescendingArray() {
        int[] arr = {9, 7, 5, 3, 1};
        assertEquals(7, SecondLargestNumber.findSecondLargest(arr));
    }
}
