package arrays;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FindDuplicateValuesTest {

	@Test
	void testDuplicatesPresent() {
		int[] arr = { 1, 2, 3, 2, 5, 1, 6 };
		List<Integer> duplicateValuesCount = FindDuplicateValues.findDuplicateValuesCount(arr);
		assertTrue(duplicateValuesCount.contains(1));
		assertTrue(duplicateValuesCount.contains(2));
		assertEquals(2, duplicateValuesCount.size());
	}

	@Test
	void testNoDuplicates() {
		int[] arr = { 1, 2, 3, 8, 5 };
		List<Integer> duplicateValuesCount = FindDuplicateValues.findDuplicateValuesCount(arr);
		assertTrue(duplicateValuesCount.isEmpty());
	}

	@Test
	void testEmptyArray() {
		int[] arr = {};
		List<Integer> duplicateValuesCount = FindDuplicateValues.findDuplicateValuesCount(arr);
		assertTrue(duplicateValuesCount.isEmpty());

	}

	@Test
	void testNullArray() {
		List<Integer> duplicateValuesCount = FindDuplicateValues.findDuplicateValuesCount(null);
		assertTrue(duplicateValuesCount.isEmpty());
	}

	@Test
	void testMultipleRepeatingNumbers() {
		int[] arr = { 4, 4, 4, 4 };
		List<Integer> duplicateValuesCount = FindDuplicateValues.findDuplicateValuesCount(arr);
		assertEquals(1, duplicateValuesCount.size());
		assertTrue(duplicateValuesCount.contains(4));
	}
}
