package ad.learning.bitwise;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BitwiseCountOnesTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testNumberOfOnesForDecimal_7() {
		// 7: 111
		assertTrue(BitwiseCountOnes.numberOfOnes(7).equals(3));
	}

	@Test
	public void testNumberOfOnesForDecimal_0() {
		// 0: 0
		assertTrue(BitwiseCountOnes.numberOfOnes(0).equals(0));
	}

	@Test
	public void testNumberOfOnesForDecimal_5485() {
		// 5485: 1010101101101
		assertTrue(BitwiseCountOnes.numberOfOnes(5485).equals(8));
	}

}
