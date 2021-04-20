package ad.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LinearSearchArrayTest {

	int[] testArrayInput;
	
	@BeforeEach
	void setUp() throws Exception {
		testArrayInput = new int[] {4,5,1,3,3};
	}

	@Test
	void testSearchElement_withValidElement() {
		assertEquals(LinearSearchArray.searchElement(testArrayInput, 3), 3);
	}
	
	@Test
	void testSearchElement_withELementNotInArray() {
		assertEquals(LinearSearchArray.searchElement(testArrayInput, 13), -1);
	}

}
