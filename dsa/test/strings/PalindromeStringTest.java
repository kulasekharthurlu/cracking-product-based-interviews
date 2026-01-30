package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PalindromeStringTest {

    @Test
    void testSimplePalindrome() {
        assertTrue(PalindromeString.isPalindrome("madam"));
    }

    @Test
    void testEvenLengthPalindrome() {
        assertTrue(PalindromeString.isPalindrome("noon"));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(PalindromeString.isPalindrome("a"));
    }

    @Test
    void testNotPalindrome() {
        assertFalse(PalindromeString.isPalindrome("hello"));
    }

    @Test
    void testWithNumbers() {
        assertTrue(PalindromeString.isPalindrome("12321"));
    }

    @Test
    void testMixedCasePalindrome() {
        assertFalse(PalindromeString.isPalindrome("Madam")); 
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeString.isPalindrome(""));
    }

    @Test
    void testWithSpecialCharacters() {
        assertTrue(PalindromeString.isPalindrome("@@@"));
    }

    @Test
    void testLongPalindrome() {
        assertTrue(PalindromeString.isPalindrome("racecar"));
    }
}
