package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LongestSubstringWithoutRepeatingTest {

    @Test
    void testNormalString() {
        assertEquals(3,
                LongestSubstringWithoutRepeating.longestSubstring("abcabcbb"));
    }

    @Test
    void testAllUniqueCharacters() {
        assertEquals(6,
                LongestSubstringWithoutRepeating.longestSubstring("abcdef"));
    }

    @Test
    void testAllSameCharacters() {
        assertEquals(1,
                LongestSubstringWithoutRepeating.longestSubstring("aaaaaa"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0,
                LongestSubstringWithoutRepeating.longestSubstring(""));
    }

    @Test
    void testSingleCharacter() {
        assertEquals(1,
                LongestSubstringWithoutRepeating.longestSubstring("a"));
    }

    @Test
    void testWithSpaces() {
        assertEquals(3,
                LongestSubstringWithoutRepeating.longestSubstring("a b a"));
    }

    @Test
    void testNullInput() {
        assertEquals(0,
                LongestSubstringWithoutRepeating.longestSubstring(null));
    }
}
