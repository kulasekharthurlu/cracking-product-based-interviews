package strings;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FirstNonRepeatingCharacterTest {
	 

	@Test
	public void testCaseWithValue() {
		String firstNotRepeatingChar = FirstNonRepeatingCharacter.findFirstNotRepeatingChar("kulasekhar");
		assertEquals("u", firstNotRepeatingChar);
	}
	@Test
	public void testCaseWithEmptyValue() {
		String firstNotRepeatingChar = FirstNonRepeatingCharacter.findFirstNotRepeatingChar("");
		assertEquals("", firstNotRepeatingChar);
	}
	
	@Test
	public void testCaseWithNullValue() {
		String firstNotRepeatingChar = FirstNonRepeatingCharacter.findFirstNotRepeatingChar(null);
		assertEquals("", firstNotRepeatingChar);
	}
}
