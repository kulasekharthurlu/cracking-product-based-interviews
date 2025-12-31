package strings;

import java.util.*;
import java.util.stream.Collectors;

public class MaxHostCounter {

    public static String findMaxCountHost(String[] hostUrls) {

        Map<String, Long> result = Arrays.stream(hostUrls)
                .map(url -> url.split(" - ")[0].trim())
                .collect(Collectors.groupingBy(host -> host, Collectors.counting()));

        long max = result.values().stream()
                .mapToLong(Long::longValue)
                .max()
                .orElse(0);

        if (max == 1) {
            System.out.println("All hosts are unique only");
            return "";
        }

        return result.entrySet().stream()
                .filter(entry -> entry.getValue() == max)
                .map(Map.Entry::getKey)
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {

        String[] hostUrls = {
                "google.com - /home",
                "amazon.com - /cart",
                "google.com - /login",
                "flipkart.com - /home",
                "google.com - /search",
                "amazon.com - /payment"
        };

        String output = findMaxCountHost(hostUrls);

        if (!output.isEmpty()) {
            System.out.println("Host(s) with maximum access count: " + output);
        }
    }
}
