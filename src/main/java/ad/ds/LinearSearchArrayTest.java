package ad.ds;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class LinearSearchArrayTest {

	int[] testArrayInput;
	
	@Before
	public void setUp() throws Exception {
		testArrayInput = new int[] {4,5,1,3,3};
	}

	@Test
	public void testSearchElement_withValidElement() {
		assertEquals(LinearSearchArray.searchElement(testArrayInput, 3), 3);
	}
	
	@Test
	public void testSearchElement_withELementNotInArray() {
		assertEquals(LinearSearchArray.searchElement(testArrayInput, 13), -1);
	}

}
