package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import static strings.ReverseString.*;

class ReverseStringTest {

	@Test
	void testNormalString() {
		assertEquals("olleh", reverse("hello"));
	}

	@Test
	void testSingleCharacter() {
		assertEquals("a", reverse("a"));
	}

	@Test
	void testEmptyString() {
		assertEquals("", reverse(""));
	}

	@Test
	void testWithSpaces() {
		assertEquals("dlroW olleH", reverse("Hello World"));
	}

	@Test
	void testWithSpecialCharacters() {
		assertEquals("@#cba", reverse("abc#@"));
	}

	@Test
	void testWithNumbers() {
		assertEquals("321cba", reverse("abc123"));
	}

	@Test
	void testPalindrome() {
		assertEquals("madam",reverse("madam"));
	}

	@Test
	void testUpperLowerCase() {
		assertEquals("rAhSaK", reverse("KashAr"));
	}
}
