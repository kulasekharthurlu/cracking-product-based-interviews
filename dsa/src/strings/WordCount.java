package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {

     public static Map<String, Long> getWordCount(String input) {
        return Arrays.stream(input.split(" "))
                .collect(Collectors.groupingBy(
                        word -> word,
                        Collectors.counting()
                ));
    }
    public static void main(String[] args) {
        String input = "my name name is sekhar";
        System.out.println(getWordCount(input));
    }
}
