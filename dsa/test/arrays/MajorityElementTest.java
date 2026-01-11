package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MajorityElementTest {

    @Test
    void testMajorityExists() {
        int[] arr = {2, 2, 1, 2, 3, 2, 2};
        assertEquals(2, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testNoMajorityElement() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(-1, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testAllSameElements() {
        int[] arr = {7, 7, 7, 7};
        assertEquals(7, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testSingleElement() {
        int[] arr = {10};
        assertEquals(10, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testTwoDifferentElements() {
        int[] arr = {1, 2};
        assertEquals(-1, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testNullArray() {
        assertEquals(-1, MajorityElement.findMajorityElement(null));
    }

    @Test
    void testNegativeNumbers() {
        int[] arr = {-1, -1, -1, 2, 3};
        assertEquals(-1, MajorityElement.findMajorityElement(arr));
    }

    @Test
    void testMajorityAppearsLate() {
        int[] arr = {1, 2, 3, 4, 5, 9, 9, 9, 9, 9};
        assertEquals(9, MajorityElement.findMajorityElement(arr));
    }
}
