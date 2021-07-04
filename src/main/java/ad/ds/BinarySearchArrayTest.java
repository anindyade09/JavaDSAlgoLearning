package ad.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BinarySearchArrayTest {
	
	int[] inputArray;
 
	@Before
	public void setUp() throws Exception {
		inputArray = new int[] {20, 30, 43, 50, 60};
	}

	@Test
	public void testBinarySearchArray_validElementSearch() {
		assertEquals(BinarySearchArray.binarySearch(inputArray, 43), 2);
	}
	
	@Test
	public void testBinarySearchArray_invalidElementSearch() {
		assertEquals(BinarySearchArray.binarySearch(inputArray, 80), -1);
	}

}
