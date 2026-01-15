package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class AnagramCheckTest {

    @Test
    void testValidAnagram() {
        assertTrue(AnagramCheck.areAnagrams("listen", "silent"));
    }

    @Test
    void testAnotherValidAnagram() {
        assertTrue(AnagramCheck.areAnagrams("abc", "cab"));
    }

    @Test
    void testNotAnagram() {
        assertFalse(AnagramCheck.areAnagrams("hello", "world"));
    }

    @Test
    void testDifferentLengthStrings() {
        assertFalse(AnagramCheck.areAnagrams("abc", "abcd"));
    }

    @Test
    void testSameString() {
        assertTrue(AnagramCheck.areAnagrams("java", "java"));
    }

    @Test
    void testWithRepeatedCharacters() {
        assertTrue(AnagramCheck.areAnagrams("aabbcc", "abcabc"));
    }

    @Test
    void testNullFirstString() {
        assertFalse(AnagramCheck.areAnagrams(null, "abc"));
    }

    @Test
    void testNullSecondString() {
        assertFalse(AnagramCheck.areAnagrams("abc", null));
    }

    @Test
    void testBothNull() {
        assertFalse(AnagramCheck.areAnagrams(null, null));
    }

    @Test
    void testSingleCharacter() {
        assertTrue(AnagramCheck.areAnagrams("a", "a"));
    }

    @Test
    void testCaseSensitive() {
        assertFalse(AnagramCheck.areAnagrams("Listen", "silent"));
    }

    @Test
    void testSpecialCharactersNotAllowed() {
        // Current logic works only for lowercase a-z
        assertThrows(ArrayIndexOutOfBoundsException.class,
                () -> AnagramCheck.areAnagrams("a#", "#a"));
    }
}
