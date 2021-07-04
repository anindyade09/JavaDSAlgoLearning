package ad.learning.arrays;

import static org.junit.Assert.assertArrayEquals;


public class ReverseArrayTest {
	
	//System Under Test
	ReverseArray reverseArray;

	@org.junit.Test
	public void testReverseInPlace_4_Elements() {
		int[] a = new int[4];
		for(int i = 1; i <= 4; i++) {
			a[i-1] = i * 10;
		}
		int[] expected = new int[] {40, 30, 20, 10};
		int[] result = ReverseArray.rvereseArray(a);
		assertArrayEquals(expected, result);
	}
	
	@org.junit.Test
	public void testReverseInPlace_5_Elements() {
		int[] a = new int[5];
		for(int i = 1; i <= 5; i++) {
			a[i-1] = i * 10;
		}
		int[] expected = new int[] {50, 40, 30, 20, 10};
		int[] result = ReverseArray.rvereseArray(a);
		assertArrayEquals(expected, result);
	}

}
