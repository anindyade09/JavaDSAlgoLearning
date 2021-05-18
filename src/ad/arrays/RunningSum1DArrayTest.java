package ad.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RunningSum1DArrayTest {

	@Test
	void testRunningSum_1() {
		int[] input = new int[] {1,2,3,4};
		int[] expected = new int[] {1,3,6,10};
		int[] result = RunningSum1DArray.runningSum(input);
		assertArrayEquals(expected, result);
	}
	
	@Test
	void testRunningSum_2() {
		int[] input = new int[] {1,1,1,1,1};
		int[] expected = new int[] {1,2,3,4,5};
		int[] result = RunningSum1DArray.runningSum(input);
		assertArrayEquals(expected, result);
	}
	
	@Test
	void testRunningSum_3() {
		int[] input = new int[] {3,1,2,10,1};
		int[] expected = new int[] {3,4,6,16,17};
		int[] result = RunningSum1DArray.runningSum(input);
		assertArrayEquals(expected, result);
	}

}
