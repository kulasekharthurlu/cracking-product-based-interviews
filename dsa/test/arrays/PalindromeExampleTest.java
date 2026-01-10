package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PalindromeExampleTest {

    @Test
    void testSimplePalindrome() {
        assertTrue(PalindromeExample.isPalindrome("madam"));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(PalindromeExample.isPalindrome("abba"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeExample.isPalindrome("hello"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeExample.isPalindrome("a"));
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeExample.isPalindrome(""));
    }

    @Test
    void testWithUppercase() {
        assertFalse(PalindromeExample.isPalindrome("Madam")); // Case-sensitive
    }

    @Test
    void testWithSpaces() {
        assertFalse(PalindromeExample.isPalindrome("nurses run"));
    }

    @Test
    void testWithNumbers() {
        assertTrue(PalindromeExample.isPalindrome("12321"));
    }
}
