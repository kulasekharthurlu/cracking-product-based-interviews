package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CharacterCountTest {

    @Test
    void testNormalInput() {
        String result = CharacterCount.getCharacterCount("aaabbcc");
        assertEquals("a3b2c2", result);
    }

    @Test
    void testSingleCharacter() {
        String result = CharacterCount.getCharacterCount("aaaa");
        assertEquals("a4", result);
    }

    @Test
    void testMixedCharacters() {
        String result = CharacterCount.getCharacterCount("abca");
        assertEquals("a2b1c1", result);
    }

    @Test
    void testEmptyString() {
        String result = CharacterCount.getCharacterCount("");
        assertEquals("", result);
    }

    @Test
    void testNullInput() {
        String result = CharacterCount.getCharacterCount(null);
        assertEquals("", result);
    }

    @Test
    void testWithNumbers() {
        String result = CharacterCount.getCharacterCount("112233");
        assertEquals("12 22 32".replace(" ", ""), result); // 122232
    }
}
