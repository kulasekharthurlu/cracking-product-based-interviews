package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCountExample {

    public static void main(String[] args) {

        String input = "my name name is sekhar";

        Map<String, Long> wordCount =
                Arrays.stream(input.split(" "))
                      .collect(Collectors.groupingBy(
                              word -> word,
                              Collectors.counting()
                      ));

        System.out.println(wordCount);
    }
}
