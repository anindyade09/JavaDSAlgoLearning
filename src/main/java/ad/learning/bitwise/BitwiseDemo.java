package ad.learning.bitwise;

public class BitwiseDemo {

	public static void main(String[] args) {
		// Bitwise | OR
		int a = 5; // 0101
		int b = 2; // 0010
		// Bitwise | 0111 (7)
		System.out.format("Bitwise OR %d | %d: %d", a, b, a | b); // Should be 7 (0111)

		// Biwise & 0000 (0)
		System.out.format("\nBitwise AND %d & %d: %d", a, b, a & b); // Should be 0 (0000)

		int x = 5; // 0101
		int y = 6; // 0110
		// Bitwise ^ 0011 (XOR) (3)
		System.out.format("\nBitwise XOR %d ^ %d: %d", x, y, x ^ y); // Should be 3 (0011)

		System.out.format("\nBitwise Compliment ~ %d: %d", x, ~x); // 2’s complement of 10 will be -6

		int s = 10; // 1010
		// Right shift 1 is 101 ie. 5 ie. 10 / 2
		// s >> 1 does not change the saved value in s
		// s >>= 1 will update the value in s
		System.out.format("\nBitwise Right Shift %d >> 1: %d", s, s >> 1); // Should return 5 (101)

		//Right shift 2 is 10 ie. 2 ie. (10 / 2) / 2
		System.out.format("\nBitwise Right Shift by 2 places %d >> 2: %d", s, s >> 2); // Should return 2 (10)
		
		// Left shift 1010 by 1 is 10100 ie. 20 ie. 10 * 2
		System.out.format("\nBitwise Left Shift %d << 1: %d", s, s << 1); // Should be 20 (10100)
		
		// Left shift 1010 by 2 is 101000 ie. 40 ie. 10 * 2 * 2
		System.out.format("\nBitwise Left Shift by 2 places %d << 2: ", s, s << 2); // Should be 40 (101000)
		
		/*
		 * Output:
		 *  Bitwise OR 5 | 2: 7
			Bitwise AND 5 & 2: 0
			Bitwise XOR 5 ^ 6: 3
			Bitwise Compliment ~ 5: -6
			Bitwise Right Shift 10 >> 1: 5
			Bitwise Right Shift by 2 places 10 >> 2: 2
			Bitwise Left Shift 10 << 1: 20
			Bitwise Left Shift by 2 places 10 << 2: 
		 */

	}

}
