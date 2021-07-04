package ad.learning.integer;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PalindromeNumberTest {
    
    @Test
    public void testIsPalindrome_0(){
        int input = 0;
        boolean expectedOuput = true;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }

    @Test
    public void testIsPalindrome_Negative(){
        int input = -123;
        boolean expectedOuput = false;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }

    @Test
    public void testIsPalindrome_NumberEndingWith0(){
        int input = 1230;
        boolean expectedOuput = false;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }

    @Test
    public void testIsPalindrome_HappyPathPositiveNumber(){
        int input = 12321;
        boolean expectedOuput = true;
        assertEquals(expectedOuput, PalindromeNumber.isPalindrome(input));
    }
}
