package strings;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterCount {

	public static void main(String[] args) {

		var sb = getCharacterCount("aabbcc");

		System.out.println(sb.toString()); // a3b2c2
	}

	public static String getCharacterCount(String string) {
		StringBuilder sb = new StringBuilder();
		Arrays.stream("aaabbcc".split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.forEach((key, value) -> sb.append(key).append(value));
		return sb.toString();
	}
}
