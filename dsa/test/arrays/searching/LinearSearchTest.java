package arrays.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LinearSearchTest {
	@Test
	void testWithValues() {
		int targetElementIndex = LinearSearch.findTargetElementIndex(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, 2);
		assertEquals(targetElementIndex, 1);
	}

	@Test
	void testWithNull() {
		int targetElementIndex = LinearSearch.findTargetElementIndex(null, 2);
		assertEquals(targetElementIndex, -1);
	}

	@Test
	void testWithEmptyArray() {
		int targetElementIndex = LinearSearch.findTargetElementIndex(new int[] {}, 2);
		assertEquals(targetElementIndex, -1);
	}
}
