package ad.integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PalindromeNumberTest {
    
    @Test
    void testIsPalindrome_0(){
        int input = 0;
        boolean expectedOuput = true;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }

    @Test
    void testIsPalindrome_Negative(){
        int input = -123;
        boolean expectedOuput = false;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }

    @Test
    void testIsPalindrome_NumberEndingWith0(){
        int input = 1230;
        boolean expectedOuput = false;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }

    @Test
    void testIsPalindrome_HappyPathPositiveNumber(){
        int input = 12321;
        boolean expectedOuput = true;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }
}
