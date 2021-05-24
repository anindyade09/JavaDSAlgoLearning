package ad.integer;

public class ReverseIntegerNumber {
    /**
     * Method to reverse the given input integer.
     * https://leetcode.com/problems/reverse-integer/
     **/
    public static int reverse(int x) {
        // Result reversed integer
        int rev = 0;
        int temp = x;

        boolean isNegative = temp < 0;
        if (isNegative) {
            temp = temp * -1;
        }

        // Check if reversed and result cannot by typecast to Integer, then return 0
        StringBuilder numberAsString = new StringBuilder(Integer.toString(temp));
        try {
            rev = Integer.parseInt(numberAsString.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }

        return isNegative ? rev * -1 : rev;
    }

    /**
     * Given a signed 32-bit integer x, return x with its digits reversed. If
     * reversing x causes the value to go outside the signed 32-bit integer range
     * [-231, 231 - 1], then return 0.
     * 
     * Assume the environment does not allow you to store 64-bit integers (signed or
     * unsigned).
     * 
     * 
     * Example 1:
     * 
     * Input: x = 123 Output: 321 
     * 
     * Example 2:
     * 
     * Input: x = -123 Output: -321 
     * 
     * Example 3:
     * 
     * Input: x = 120 Output: 21 
     * 
     * Example 4:
     * 
     * Input: x = 0 Output: 0
     * 
     */
}
