package ad.integer;

import java.util.HashMap;

/**
 * Conversion from Roman Numeral String to Integer value
 * https://leetcode.com/problems/roman-to-integer/
 */

public class RomanToInteger {
    static HashMap<String, Integer> romanDecimalMap = new HashMap<>();
    static {
        romanDecimalMap.put("I", 1);
        romanDecimalMap.put("V", 5);
        romanDecimalMap.put("X", 10);
        romanDecimalMap.put("L", 50);
        romanDecimalMap.put("C", 100);
        romanDecimalMap.put("D", 500);
        romanDecimalMap.put("M", 1000);
    }

    public static int romanToInt(String s) {
        // The value in decimal number
        int total = 0;

        String currentChar = null;
        String nextChar = null;

        //If length of Roman string is 1 then we just need to return its equivalent numeric value
        if(s.length() == 1){
            nextChar = Character.toString(s.charAt(0));
        }
        else{
            //else Do the calculation
            for (int i = 0; i < s.length() - 1; i++) {
                currentChar = Character.toString(s.charAt(i));
                nextChar = Character.toString(s.charAt(i + 1));

                // If currentChar position is >= nextChar, add value for currentChar to total
                // otherwise subtract it from total
                if (romanDecimalMap.get(currentChar) >= romanDecimalMap.get(nextChar)) {
                    total = total + romanDecimalMap.get(currentChar);
                } else {
                    total = total - romanDecimalMap.get(currentChar);
                }
            }
        }
        // Here nextChar will be pointing to the last character now so add this to total
        total = total + romanDecimalMap.get(nextChar);

        return total;
    }
}
