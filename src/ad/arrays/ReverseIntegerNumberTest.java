package ad.arrays;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseIntegerNumberTest {
    
    @Test
    void testReverseIntegerSolution_PositiveNumber(){
        int input = 123;
        int expectedOuput = 321;
        assertEquals(expectedOuput, ReverseIntegerNumber.reverse(input));
    }

    @Test
    void testReverseIntegerSolution_NegativeNumber(){
        int input = -123;
        int expectedOuput = -321;
        assertEquals(expectedOuput, ReverseIntegerNumber.reverse(input));
    }

    @Test
    void testReverseIntegerSolution_NumberGreaterThan32BitInteger(){
        int input = 1234562789;
        int expectedOuput = 0;
        assertEquals(expectedOuput, ReverseIntegerNumber.reverse(input));
    }
}
