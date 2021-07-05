package ad.ds.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Kth Most Frequent String
 *
 */
public class KthMostFrequentString {

	public static String findKthMostFrequentString(List<String> inputStrings, int k) {
		// 1. Maintain a Hashmap to contain the Key (string) : Value (frequency)
		HashMap<String, Integer> mapStringFreq = new HashMap<String, Integer>();

		// 2. Populate the data in above map
		for (String s : inputStrings) {
			Integer f = mapStringFreq.get(s);
			if (null == f)
				f = 0;
			mapStringFreq.put(s, ++f);
		}

		// 3. Sort the data (as in map Entry) based on the Frequency
		List<Map.Entry<String, Integer>> entries = new ArrayList<>(mapStringFreq.entrySet());

		Collections.sort(entries, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));

		// 4. Check if k is in the range of the list entries and return the String key
		if (k < entries.size())
			return entries.get(k).getKey();

		// Return null otherwise
		return null;
	}

}
