package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class MaxHostCounterTest {

    @Test
    void testSingleMaxHost() {
        String[] hostUrls = {
                "google.com - /home",
                "amazon.com - /cart",
                "google.com - /login",
                "flipkart.com - /home",
                "google.com - /search",
                "amazon.com - /payment"
        };

        String result = MaxHostCounter.findMaxCountHost(hostUrls);

        assertEquals("google.com", result);
    }

    @Test
    void testMultipleHostsWithSameMaxCount() {
        String[] hostUrls = {
                "google.com - /home",
                "amazon.com - /cart",
                "google.com - /login",
                "amazon.com - /payment"
        };

        String result = MaxHostCounter.findMaxCountHost(hostUrls);

        assertTrue(result.contains("google.com"));
        assertTrue(result.contains("amazon.com"));
    }

    @Test
    void testAllHostsUnique() {
        String[] hostUrls = {
                "google.com - /home",
                "amazon.com - /cart",
                "flipkart.com - /home"
        };

        String result = MaxHostCounter.findMaxCountHost(hostUrls);

        assertEquals("", result);
    }

    @Test
    void testSingleElementArray() {
        String[] hostUrls = {
                "google.com - /home"
        };

        String result = MaxHostCounter.findMaxCountHost(hostUrls);

        assertEquals("", result);
    }

    @Test
    void testWithExtraSpaces() {
        String[] hostUrls = {
                " google.com  - /home",
                "google.com - /login",
                " google.com - /search "
        };

        String result = MaxHostCounter.findMaxCountHost(hostUrls);

        assertEquals("google.com", result);
    }

    @Test
    void testEmptyArray() {
        String[] hostUrls = {};

        String result = MaxHostCounter.findMaxCountHost(hostUrls);

        assertEquals("", result);
    }
}
