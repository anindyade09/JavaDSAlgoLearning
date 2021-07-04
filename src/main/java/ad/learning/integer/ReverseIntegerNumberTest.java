package ad.learning.integer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseIntegerNumberTest {
    
    @Test
    public void testReverseIntegerSolution_PositiveNumber(){
        int input = 123;
        int expectedOuput = 321;
        assertEquals(expectedOuput, ReverseIntegerNumber.reverse(input));
    }

    @Test
    public void testReverseIntegerSolution_NegativeNumber(){
        int input = -123;
        int expectedOuput = -321;
        assertEquals(expectedOuput, ReverseIntegerNumber.reverse(input));
    }

    @Test
    public void testReverseIntegerSolution_NumberGreaterThan32BitInteger(){
        int input = 1234562789;
        int expectedOuput = 0;
        assertEquals(expectedOuput, ReverseIntegerNumber.reverse(input));
    }
}
