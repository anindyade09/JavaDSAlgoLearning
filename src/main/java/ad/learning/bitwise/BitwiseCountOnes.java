package ad.learning.bitwise;

public class BitwiseCountOnes {
	
	

	public static void main(String[] args) {
		int number = 6; // Binary: 0110
		System.out.format("%d has %d ones in its Binary equivalent", number, numberOfOnes(number));
		// Should be 2 for input decimal number 6
	}

	/**
	 * Counts the number of 1's in the Binary equivalent of the given number.
	 * @param number Input number.
	 * @return Number of Ones in the Binary equivalent.
	 */
	public static Object numberOfOnes(final int number) {
		int numberOfOnes = 0;
		int input = number;
		
		// 1. Check till input is not 0
		// 2. Bitwise & (AND) with 1 (0001) will provide 1 or 0 based on input's last Binary bit
		// 3. Add this to the result numberOfOnes
		// 4. Right shift the input now and do the above steps
		
		while(input != 0) {
			numberOfOnes = numberOfOnes + (input & 1);
			input >>= 1;
		}
		
		return numberOfOnes;
	}

}
