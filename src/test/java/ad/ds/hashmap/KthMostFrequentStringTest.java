package ad.ds.hashmap;

import static org.junit.Assert.assertSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class KthMostFrequentStringTest {
	
	List<String> strings;

	@Before
	public void setUp() throws Exception {
		strings = new ArrayList<String>();
		strings.add("A");
		strings.add("A");
		strings.add("A");
		strings.add("B");
		strings.add("C");
		strings.add("C");
		
	}

	@Test
	public void testFindKthMostFrequentString() {
		assertSame("A", KthMostFrequentString.findKthMostFrequentString(strings, 2));
	}

}
