package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class FindMissingNumberTest {

    @Test
    void testMissingInMiddle() {
        int[] arr = {1, 2, 3, 4, 6, 7, 8};
        assertEquals(5, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testMissingAtBeginning() {
        int[] arr = {2, 3, 4, 5};
        assertEquals(-1, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testMissingAtEnd() {
        int[] arr = {1, 2, 3, 4};
        assertEquals(-1, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testNoMissingNumber() {
        int[] arr = {5, 6, 7, 8, 9};
        assertEquals(-1, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testSingleElement() {
        int[] arr = {1};
        assertEquals(-1, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testNullArray() {
        assertEquals(-1, FindMissingNumber.findMissingNumber(null));
    }

    @Test
    void testWithNegativeNumbers() {
        int[] arr = {-3, -2, -1, 0, 2, 3};
        assertEquals(1, FindMissingNumber.findMissingNumber(arr));
    }

    @Test
    void testLargeRange() {
        int[] arr = {100, 101, 102, 103, 105, 106};
        assertEquals(104, FindMissingNumber.findMissingNumber(arr));
    }
}
