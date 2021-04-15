package ad.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseArrayTest {
	
	//System Under Test
	ReverseArray reverseArray;

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testReverseInPlace_4_Elements() {
		int[] a = new int[4];
		for(int i = 1; i <= 4; i++) {
			a[i-1] = i * 10;
		}
		int[] expected = new int[] {40, 30, 20, 10};
		int[] result = ReverseArray.reverseInPlace(a);
		assertArrayEquals(expected, result);
	}
	
	@Test
	void testReverseInPlace_5_Elements() {
		int[] a = new int[5];
		for(int i = 1; i <= 5; i++) {
			a[i-1] = i * 10;
		}
		int[] expected = new int[] {50, 40, 30, 20, 10};
		int[] result = ReverseArray.reverseInPlace(a);
		assertArrayEquals(expected, result);
	}

}
