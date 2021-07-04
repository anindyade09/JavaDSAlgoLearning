package ad.learning.strings;

import java.math.BigDecimal;

public class TestString {

	/**
	 * To check how compareTo() behaves in Strings
	 */
	public static void checkCompareToInStrings() {
		String s1 = "TEST";
		String s2 = "TESt";

		System.out.println(s1.compareTo(s2));
	}

	/**
	 * To check the special case in JDK's {@link BigDecimal} class where compareTo() is not in line with
	 * equals() method
	 */
	public static void checkCompareToAndEqualsInBigDecimal() {
		// Special Case in JDK BigDecimal where Value and Scales are used to check
		// equality in .equals() method
		// but not in .compareTo()

		BigDecimal bd1 = new BigDecimal("2.0");
		BigDecimal bd2 = new BigDecimal("2.00");

		System.out.println("comparing BigDecimal using equals: " + bd1.equals(bd2)); // Returns false as scale is not
																						// the same even though value is
																						// same
		System.out.println("comparing BigDecimal using compareTo: " + bd1.compareTo(bd2)); // Returns 0 as
	}

	public static void main(String[] args) {
		checkCompareToInStrings();

		checkCompareToAndEqualsInBigDecimal();
	}

}