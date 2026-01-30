package strings;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class VowelsAndConsonantsCounterTest {

	@Test
	void testNormalSentence() {
		String input = "Hello World";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 3  Consonants Count : 7", result);
	}

	@Test
	void testOnlyVowels() {
		String input = "aeiou";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 5  Consonants Count : 0", result);
	}

	@Test
	void testOnlyConsonants() {
		String input = "bcdfg";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 0  Consonants Count : 5", result);
	}

	@Test
	void testMixedWithNumbersAndSymbols() {
		String input = "Java@123!";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 2  Consonants Count : 2", result);
	}

	@Test
	void testUppercaseLetters() {
		String input = "AEIOUxyz";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 5  Consonants Count : 3", result);
	}

	@Test
	void testEmptyString() {
		String input = "";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 0  Consonants Count : 0", result);
	}

	@Test
	void testOnlySpecialCharacters() {
		String input = "!@#$%";

		String result = VowelsAndConsonantsCounter.countVowelsConsonants(input);

		assertEquals("Vowels Count : 0  Consonants Count : 0", result);
	}
}
