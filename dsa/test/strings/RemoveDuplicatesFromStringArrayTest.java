package strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveDuplicatesFromStringArrayTest {

	@Test
	void testRemoveDuplicates_NormalCase() {
		String[] input = { "apple", "banana", "apple", "orange", "banana" };
		String[] expected = { "apple", "banana", "orange" };

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRemoveDuplicates_NoDuplicates() {
		String[] input = { "apple", "banana", "orange" };
		String[] expected = { "apple", "banana", "orange" };

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRemoveDuplicates_AllDuplicates() {
		String[] input = { "apple", "apple", "apple" };
		String[] expected = { "apple" };

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRemoveDuplicates_SingleElement() {
		String[] input = { "apple" };
		String[] expected = { "apple" };

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRemoveDuplicates_EmptyArray() {
		String[] input = {};
		String[] expected = {};

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRemoveDuplicates_WithNullValues() {
		String[] input = { "apple", null, "banana", null, "apple" };
		String[] expected = { "apple", null, "banana" };

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}

	@Test
	void testRemoveDuplicates_CaseSensitive() {
		String[] input = { "Apple", "apple", "APPLE" };
		String[] expected = { "Apple", "apple", "APPLE" };

		String[] actual = RemoveDuplicatesFromStringArray.removeDuplicates(input);

		assertArrayEquals(expected, actual);
	}
}
