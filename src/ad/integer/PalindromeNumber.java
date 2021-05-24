package ad.integer;

/**
 * Given an integer x, return true if x is palindrome integer Without converting it to string
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    public static boolean isPalindrome(int x) {
        
        //if x is -ve then it can never be a palindrome
        //if x is +ve and a multiple of 10 then it cannot be a palindrome either
        if(x < 0 || (x > 0 && x % 10 == 0)){
            return false;
        }else if(x == 0){
            //if x is 0 then it is a palindrome
            return true;
        }
        
        int rev = 0;
        for(int temp = x; temp > 0; temp = temp / 10){
            rev = 10 * rev + temp % 10;
        }
        
        //if palindrome then the reversed number will be the same as the input
        if(x == rev){
            return true;
        }
        
        return false;
        
    }
    
}
