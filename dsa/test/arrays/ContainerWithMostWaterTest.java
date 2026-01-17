package arrays;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ContainerWithMostWaterTest {

    @Test
    void testNormalCase() {
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, ContainerWithMostWater.maxArea(height));
    }

    @Test
    void testTwoElements() {
        int[] height = {1,1};
        assertEquals(1, ContainerWithMostWater.maxArea(height));
    }

    @Test
    void testIncreasingHeights() {
        int[] height = {1,2,3,4,5};
        assertEquals(6, ContainerWithMostWater.maxArea(height));
    }

    @Test
    void testDecreasingHeights() {
        int[] height = {5,4,3,2,1};
        assertEquals(6, ContainerWithMostWater.maxArea(height));
    }

    @Test
    void testAllSameHeights() {
        int[] height = {4,4,4,4};
        assertEquals(12, ContainerWithMostWater.maxArea(height));
    }

    @Test
    void testNullArray() {
        assertEquals(0, ContainerWithMostWater.maxArea(null));
    }

    @Test
    void testSingleElement() {
        int[] height = {5};
        assertEquals(0, ContainerWithMostWater.maxArea(height));
    }
}
