package ad.learning.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
    // Write your code here
        for(int i = 1 ; i <= n ; i++){
            if(divisibleBy(i, 3) && divisibleBy(i, 5))
                System.out.println("FizzBuzz");
            else if(divisibleBy(i, 3))
                System.out.println("Fizz");
            else if(divisibleBy(i, 5))
                System.out.println("Buzz");
            else
                System.out.println(i);
        }

    }
    
    private static boolean divisibleBy(int n, int d){
        return n % d == 0;
    }

}

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.fizzBuzz(n);

        bufferedReader.close();
    }
}