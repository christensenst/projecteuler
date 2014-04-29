package projecteuler.problem0020;

import java.math.BigInteger;

/**
 * Find the sum of the digits in the number 100!
 */
public class Problem0020 {
    
    public static void main(String[] args)
    {
        BigInteger factorial = BigInteger.ONE;
        for (long i = 1; i <= 100; i++)
        {
            BigInteger value = BigInteger.valueOf(i);
            factorial = factorial.multiply(value);
        }
        String stringFactorial = factorial.toString();
        int total = 0;
        for (int j = 0; j < stringFactorial.length(); j++)
        {
            int x = Integer.parseInt(stringFactorial.valueOf(stringFactorial.charAt(j)));
            total += x;
        }
        System.out.println(total);
    }
}
