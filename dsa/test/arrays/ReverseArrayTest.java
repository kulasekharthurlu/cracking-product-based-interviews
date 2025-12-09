package arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class ReverseArrayTest {

	@Test
	void testWithValues() {
		int[] reverseArray = ReverseArray.reverseArray(new int[] { 1, 2, 3, 4, 5 });
		assertArrayEquals(new int[] { 5, 4, 3, 2, 1 }, reverseArray);
	}

	@Test
	void testWithNull() {
		int[] reverseArray = ReverseArray.reverseArray(null);
		assertArrayEquals(new int[] {}, reverseArray);
	}

	@Test
	void testWithEmptyArray() {
		int[] reverseArray = ReverseArray.reverseArray(new int[] {});
		assertArrayEquals(new int[] {}, reverseArray);
	}

	@Test
	void testWithValue2() {
		int[] reverseArray = ReverseArray.reverseArray(new int[] { 1, 2, 3, 2, 1 });
		assertArrayEquals(new int[] { 1, 2, 3, 2, 1 }, reverseArray);
	}
}
