package arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondLargestFinderTest {

    @Test
    void shouldReturnNullForNullArray() {
        assertNull(SecondLargestFinder.findSecondLargest(null));
    }

    @Test
    void shouldReturnNullForSingleElement() {
        assertNull(SecondLargestFinder.findSecondLargest(new int[]{10}));
    }

    @Test
    void shouldReturnSecondLargestNormally() {
        int[] arr = {10, 5, 20, 8};
        assertEquals(10, SecondLargestFinder.findSecondLargest(arr));
    }

    @Test
    void shouldReturnSecondLargestWithNegatives() {
        int[] arr = {-10, -5, -1, -20};
        assertEquals(-5, SecondLargestFinder.findSecondLargest(arr));
    }

    @Test
    void shouldReturnNullIfAllValuesSame() {
        int[] arr = {5, 5, 5, 5};
        assertNull(SecondLargestFinder.findSecondLargest(arr));
    }

    @Test
    void shouldWorkWithDuplicates() {
        int[] arr = {4, 6, 6, 2};
        assertEquals(4, SecondLargestFinder.findSecondLargest(arr));
    }

    @Test
    void shouldWorkWithDescendingArray() {
        int[] arr = {9, 7, 5, 3, 1};
        assertEquals(7, SecondLargestFinder.findSecondLargest(arr));
    }
}
