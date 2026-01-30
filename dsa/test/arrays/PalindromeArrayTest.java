package arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class PalindromeArrayTest {

	@Test
	void testSimplePalindrome() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 1, 2, 3, 2, 1 }));
	}

	@Test
	void testEvenLengthPalindrome() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 4, 5, 5, 4 }));
	}

	@Test
	void testSingleElement() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 7 }));
	}

	@Test
	void testEmptyArray() {
		assertTrue(PalindromeArray.isPalindrome(new int[] {}));
	}

	@Test
	void testWithNegativeNumbers() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { -1, -2, -1 }));
	}

	@Test
	void testWithZeros() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 0, 0, 0 }));
	}

	@Test
	void testLongPalindrome() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 1, 2, 3, 4, 5, 4, 3, 2, 1 }));
	}

	@Test
	void testWithDuplicates() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 2, 2, 2, 2 }));
	}

	@Test
	void testWithLargeNumbers() {
		assertTrue(PalindromeArray.isPalindrome(new int[] { 1000000, 2000000, 1000000 }));
	}

	@Test
	void testNullArray() {
		assertTrue(PalindromeArray.isPalindrome(null));
	}

}
