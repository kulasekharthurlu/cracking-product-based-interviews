package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PalindromeStringTest {

    @Test
    void testSimplePalindrome() {
        assertTrue(PalindromeExample.isPalindrome("madam"));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(PalindromeExample.isPalindrome("noon"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeExample.isPalindrome("a"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeExample.isPalindrome("hello"));
    }

    @Test
    void testWithNumbers() {
        assertTrue(PalindromeExample.isPalindrome("12321"));
    }

    @Test
    void testMixedCasePalindrome() {
        assertFalse(PalindromeExample.isPalindrome("Madam")); 
        // because current logic is case-sensitive
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeExample.isPalindrome(""));
    }

    @Test
    void testWithSpecialCharacters() {
        assertTrue(PalindromeExample.isPalindrome("@@@"));
    }

    @Test
    void testLongPalindrome() {
        assertTrue(PalindromeExample.isPalindrome("racecar"));
    }
}
