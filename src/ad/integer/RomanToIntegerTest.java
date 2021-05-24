package ad.integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RomanToIntegerTest {

    @Test
    void testRomanToIntegerConversion_D(){
        String input ="D";
        int expectedOuput = 500;
        assertEquals(expectedOuput, RomanToInteger.romanToInt(input));
    }

    @Test
    void testRomanToIntegerConversion_III(){
        String input ="III";
        int expectedOuput = 3;
        assertEquals(expectedOuput, RomanToInteger.romanToInt(input));
    }

    @Test
    void testRomanToIntegerConversion_IV(){
        String input ="IV";
        int expectedOuput = 4;
        assertEquals(expectedOuput, RomanToInteger.romanToInt(input));
    }

    @Test
    void testRomanToIntegerConversion_IX(){
        String input ="IX";
        int expectedOuput = 9;
        assertEquals(expectedOuput, RomanToInteger.romanToInt(input));
    }

    @Test
    void testRomanToIntegerConversion_LVIII(){
        String input ="LVIII";
        int expectedOuput = 58;
        assertEquals(expectedOuput, RomanToInteger.romanToInt(input));
    }

    @Test
    void testRomanToIntegerConversion_MCMXCIV(){
        String input ="MCMXCIV";
        int expectedOuput = 1994;
        assertEquals(expectedOuput, RomanToInteger.romanToInt(input));
    }
}
