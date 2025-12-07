package arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class MoveZerosTest {

	
	// Test cases for move zeros to end
	@Test
	public void testWithValues() {
		int[] moveZeroEnd = MoveZeros.moveZeroEnd(new int[] {0,4,0,12,3,4,7,0,1});
		assertArrayEquals(new int[] {4,12,3,4,7,1,0,0,0}, moveZeroEnd);
	}
	@Test
	public void testWithOutValues() {
		int[] moveZeroEnd = MoveZeros.moveZeroEnd(new int[] {});
		assertArrayEquals(new int[] {}, moveZeroEnd);
	}
	@Test
	public void testWithNullInput() {
		int[] moveZeroEnd = MoveZeros.moveZeroEnd(null);
		assertArrayEquals(new int[] {}, moveZeroEnd);
	}
	
	// Test cases for move zeros to first
	@Test
	public void testCaseWithValues() {
		int[] moveZeroEnd = MoveZeros.moveZeroFirst(new int[] {0,4,0,12,3,4,7,0,1});
		assertArrayEquals(new int[] {4,12,3,4,7,1,0,0,0}, moveZeroEnd);
	}
	@Test
	public void testCaseWithOutValues() {
		int[] moveZeroEnd = MoveZeros.moveZeroFirst(new int[] {});
		assertArrayEquals(new int[] {}, moveZeroEnd);
	}
	@Test
	public void testCaseWithNullInput() {
		int[] moveZeroEnd = MoveZeros.moveZeroFirst(null);
		assertArrayEquals(new int[] {}, moveZeroEnd);
	}
}
