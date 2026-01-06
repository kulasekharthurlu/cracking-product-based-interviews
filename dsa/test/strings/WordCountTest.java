package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Map;

class WordCountTest {

    @Test
    void testNormalSentence() {
        String input = "my name name is sekhar";

        Map<String, Long> result = WordCount.getWordCount(input);

        assertEquals(1, result.get("my"));
        assertEquals(2, result.get("name"));
        assertEquals(1, result.get("is"));
        assertEquals(1, result.get("sekhar"));
    }

    @Test
    void testSingleWord() {
        String input = "hello";

        Map<String, Long> result = WordCount.getWordCount(input);

        assertEquals(1, result.get("hello"));
    }

    @Test
    void testRepeatedWords() {
        String input = "java java java java";

        Map<String, Long> result = WordCount.getWordCount(input);

        assertEquals(4, result.get("java"));
    }

    @Test
    void testEmptyString() {
        String input = "";

        Map<String, Long> result = WordCount.getWordCount(input);

        assertEquals(1, result.get(""));   // Because split(" ") returns [""]
    }

    @Test
    void testCaseSensitivity() {
        String input = "Java java JAVA";

        Map<String, Long> result = WordCount.getWordCount(input);

        assertEquals(1, result.get("Java"));
        assertEquals(1, result.get("java"));
        assertEquals(1, result.get("JAVA"));
    }
}
