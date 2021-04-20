package ad.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BinarySearchArrayTest {
	
	int[] inputArray;
 
	@BeforeEach
	void setUp() throws Exception {
		inputArray = new int[] {20, 30, 43, 50, 60};
	}

	@Test
	void testBinarySearchArray_validElementSearch() {
		assertEquals(BinarySearchArray.binarySearch(inputArray, 43), 2);
	}
	
	@Test
	void testBinarySearchArray_invalidElementSearch() {
		assertEquals(BinarySearchArray.binarySearch(inputArray, 80), -1);
	}

}
