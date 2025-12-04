package arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TwoSumTest {

	 
	
	@Test
	public void testTwoSum_Basic() {
		int[] twoSum = TwoSum.twoSum(new int[] {1,2,3,4,5,6,7,8}, 4);
		assertArrayEquals(new int[] {0,2}, twoSum);
	}
	
	@Test
	public void testTwoSum_Duplicates() {
		int[] twoSum = TwoSum.twoSum(new int[] {1,1,2,2,3,3,4,5,6,7,8,2}, 4);
		assertArrayEquals(new int[] {1,4}, twoSum);
	}
}
